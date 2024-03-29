package nl.tue.base;

import nl.tue.base.dto.request.BlockAccountRequestType;
import nl.tue.base.mq.MqManager;
import nl.tue.base.mq.jms.RabbitMQSender;
import nl.tue.base.mq.service.LogService;
import nl.tue.base.mq.util.XmlParser;
import nl.tue.base.ruleengine.constants.RuleName;
import nl.tue.base.ruleengine.service.RuleService;
import nl.tue.base.ruleengineservicedto.dto.AccountDto;
import nl.tue.base.ruleengineservicedto.util.RuleErrorCode;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ComponentScan("nl.tue.base")
public class ApplicationTest {

    @Autowired
    private RuleService ruleService;

    @Autowired
    private RabbitMQSender rabbitMQSender;

    @Autowired
    MqManager<BlockAccountRequestType> blockAccountReqMqManager;

    @Autowired
    XmlParser xmlParser;

    @Autowired
    private LogService logService;

    @Test
    public void accountBalanced() {
        AccountDto account = new AccountDto();
        account.setAccountNumber("123456");
        account.setAccountType("Deposit");
        account.setBalance(200);
        AccountDto ruleOnAccountModel = ruleService.applyOneRuleOneModel(account, RuleName.THIRD_LIBRARY);

        Assert.assertNull(ruleOnAccountModel.getMessage());
    }


    @Test
    public void blockAccountIflowBalanced() {
        AccountDto lowBalancedAccount = new AccountDto();
        lowBalancedAccount.setAccountNumber("123456");
        lowBalancedAccount.setAccountType("Deposit");
        lowBalancedAccount.setBalance(99);
        AccountDto ruleOnAccountModel = ruleService.applyOneRuleOneModel(lowBalancedAccount, RuleName.THIRD_LIBRARY);

        Assert.assertNotNull(ruleOnAccountModel.getMessage());
        Assert.assertTrue(RuleErrorCode.ACCOUNT_LOW_BALANCE.toString().equals(ruleOnAccountModel.getMessage()));

        BlockAccountRequestType blockAccountReq = new BlockAccountRequestType();
        blockAccountReq.setAccountNumber(lowBalancedAccount.getAccountNumber());
        blockAccountReq.setDescription("current balance is " + lowBalancedAccount.getBalance() + " less than required minimum");
        blockAccountReqMqManager.service(blockAccountReq);
    }

    @Test
    public void blockAccountIfHighBalanced() {
        AccountDto highBalancedAccount = new AccountDto();
        highBalancedAccount.setAccountNumber("654321");
        highBalancedAccount.setAccountType("Deposit");
        highBalancedAccount.setBalance(10100);
        String[] rules = new String[1];
        rules[0] = RuleName.FOURTH_LIBRARY;

        AccountDto ruleOnAccountModel = ruleService.applyMoreRulesOneModel(highBalancedAccount, rules);

        Assert.assertNotNull(ruleOnAccountModel.getMessage());
        Assert.assertTrue(RuleErrorCode.ACCOUNT_HIGH_BALANCE.toString().equals(ruleOnAccountModel.getMessage()));

        BlockAccountRequestType blockAccountReq = new BlockAccountRequestType();
        blockAccountReq.setAccountNumber(highBalancedAccount.getAccountNumber());
        blockAccountReq.setDescription("current balance is " + highBalancedAccount.getBalance() + " more than accepted maximum");
        blockAccountReqMqManager.service(blockAccountReq);
    }

}

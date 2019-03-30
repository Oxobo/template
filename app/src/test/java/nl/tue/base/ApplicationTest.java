package nl.tue.base;

import nl.tue.base.dto.request.AbstractRequestType;
import nl.tue.base.dto.request.BlockAccountRequestType;
import nl.tue.base.mq.jms.RabbitMQSender;
import nl.tue.base.mq.request.BlockAccountRequestService;
import nl.tue.base.mq.service.LogService;
import nl.tue.base.mq.util.XmlParser;
import nl.tue.base.ruleengine.constants.RuleName;
import nl.tue.base.ruleengine.service.RuleService;
import nl.tue.base.ruleengineservicedto.dto.AccountDto;
import nl.tue.base.ruleengineservicedto.util.RuleErrorCode;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

import javax.xml.bind.JAXBException;
import java.io.File;
import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
@ComponentScan("nl.tue.base")
public class ApplicationTest {

    @Autowired
    private RuleService ruleService;

    @Autowired
    private RabbitMQSender rabbitMQSender;

    @Autowired
    BlockAccountRequestService blockAccountRequestService;

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

        BlockAccountRequestType blockAccountRequestServiceType = blockAccountRequestService.createType();
        blockAccountRequestServiceType.setAccountNumber(lowBalancedAccount.getAccountNumber());
        blockAccountRequestServiceType.setDescription("current balance is " + lowBalancedAccount.getBalance()+" less than required minimum");
        String makeXmlOfPingRequest = makeXmlOf(blockAccountRequestServiceType);
        rabbitMQSender.send(makeXmlOfPingRequest);
    }

    @Test
    public void blockAccountIfHighBalanced() {
        AccountDto highBalancedAccount = new AccountDto();
        highBalancedAccount.setAccountNumber("654321");
        highBalancedAccount.setAccountType("Deposit");
        highBalancedAccount.setBalance(10100);
        String[] rules = new String[1];
        rules[0]=RuleName.FOURTH_LIBRARY;

        AccountDto ruleOnAccountModel = ruleService.applyMoreRulesOneModel(highBalancedAccount, rules);

        Assert.assertNotNull(ruleOnAccountModel.getMessage());
        Assert.assertTrue(RuleErrorCode.ACCOUNT_HIGH_BALANCE.toString().equals(ruleOnAccountModel.getMessage()));

        BlockAccountRequestType blockAccountRequestServiceType = blockAccountRequestService.createType();
        blockAccountRequestServiceType.setAccountNumber(highBalancedAccount.getAccountNumber());
        blockAccountRequestServiceType.setDescription("current balance is " + highBalancedAccount.getBalance()+" more than accepted maximum");
        String makeXmlOfPingRequest = makeXmlOf(blockAccountRequestServiceType);
        rabbitMQSender.send(makeXmlOfPingRequest);
    }

    private String makeXmlOf(AbstractRequestType abstractRequestType) {
        File f = new File("F_" + abstractRequestType.getClass().getSimpleName() + ".xml");
        String xmlRequest = "";
        try {
            xmlRequest = xmlParser.marshall(abstractRequestType);
            logService.insertMqRequestLog(abstractRequestType, xmlRequest);
            FileUtils.writeStringToFile(f, xmlRequest, "UTF-8");
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return xmlRequest;
    }
}

package nl.tue.base.ruleengine;

import nl.tue.base.ruleengine.constants.RuleName;
import nl.tue.base.ruleengine.domain.ModelRuleEngine;
import nl.tue.base.ruleengine.service.RuleService;
import nl.tue.base.ruleengineservicedto.dto.AccountDto;
import nl.tue.base.ruleengineservicedto.util.RuleErrorCode;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RuleApplicationTest {


    String[] sss;
    AccountDto accountDto;
    AccountDto newAccountDto;
    List<AccountDto> models;

    public RuleApplicationTest() {
        sss = new String[2];
        sss[0] = RuleName.THIRD_LIBRARY;
        sss[1] = RuleName.FOURTH_LIBRARY;

        ModelRuleEngine model = new ModelRuleEngine();
        model.setBalance(20);
        ModelMapper modelMapper = new ModelMapper();
        accountDto = new AccountDto();
        modelMapper.map(model, accountDto);

        ModelRuleEngine newModel = new ModelRuleEngine();
        newModel.setBalance(120);
        ModelMapper newModelMapper = new ModelMapper();
        newAccountDto = new AccountDto();
        newModelMapper.map(newModel, newAccountDto);

        models = new ArrayList<>();
        models.add(accountDto);
        models.add(newAccountDto);
    }

    @Autowired
    private RuleService ruleService;


    @Test
    public void moreRulesOneModel() {

        AccountDto dto = ruleService.applyMoreRulesOneModel(accountDto, sss);
        if (dto.getMessage() != null && dto.getMessage().equals(RuleErrorCode.ACCOUNT_LOW_BALANCE.toString())) {
            Assert.assertTrue(dto.getMessage().equals(RuleErrorCode.ACCOUNT_LOW_BALANCE.toString()));
        }
    }

    @Test
    public void oneRuleMoreModels() {
        List<AccountDto> lists = ruleService.applyOneRuleMoreModels(models, RuleName.THIRD_LIBRARY);
        if (lists.get(0).getMessage() != null && lists.get(0).getMessage().equals(RuleErrorCode.ACCOUNT_LOW_BALANCE.toString())) {
            Assert.assertTrue(lists.get(0).getMessage().equals(RuleErrorCode.ACCOUNT_LOW_BALANCE.toString()));
        }
        if (lists.get(1).getMessage() != null && lists.get(1).getMessage().equals(RuleErrorCode.ACCOUNT_HIGH_BALANCE.toString())) {
            Assert.assertTrue(lists.get(1).getMessage().equals(RuleErrorCode.ACCOUNT_HIGH_BALANCE.toString()));
        }
    }

    @Test
    public void oneRuleOneModel() {
        AccountDto model = ruleService.applyOneRuleOneModel(accountDto, RuleName.THIRD_LIBRARY);
        if (model.getMessage() != null && model.getMessage().equals(RuleErrorCode.ACCOUNT_LOW_BALANCE.toString())) {
            Assert.assertTrue(model.getMessage().equals(RuleErrorCode.ACCOUNT_LOW_BALANCE.toString()));
        }
    }


}
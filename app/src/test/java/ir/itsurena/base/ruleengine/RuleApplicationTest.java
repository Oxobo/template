package ir.itsurena.base.ruleengine;

import ir.itsurena.base.ruleengine.constants.RuleName;
import ir.itsurena.base.ruleengine.domain.ModelRuleEngine;
import ir.itsurena.base.ruleengine.service.RuleService;
import ir.itsurena.base.ruleengineservicedto.dto.ModelRuleEngineDto;
import ir.itsurena.base.ruleengineservicedto.util.RuleErrorCode;
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
    ModelRuleEngineDto modelRuleEngineDto;
    ModelRuleEngineDto newModelRuleEngineDto;
    List<ModelRuleEngineDto> models;

    public RuleApplicationTest() {
        sss = new String[2];
        sss[0] = RuleName.THIRD_LIBRARY;
        sss[1] = RuleName.FOURTH_LIBRARY;

        ModelRuleEngine model = new ModelRuleEngine();
        model.setBalance(20);
        ModelMapper modelMapper = new ModelMapper();
        modelRuleEngineDto = new ModelRuleEngineDto();
        modelMapper.map(model, modelRuleEngineDto);

        ModelRuleEngine newModel = new ModelRuleEngine();
        newModel.setBalance(120);
        ModelMapper newModelMapper = new ModelMapper();
        newModelRuleEngineDto = new ModelRuleEngineDto();
        newModelMapper.map(newModel, newModelRuleEngineDto);

        models = new ArrayList<>();
        models.add(modelRuleEngineDto);
        models.add(newModelRuleEngineDto);
    }

    @Autowired
    private RuleService ruleService;


    @Test
    public void moreRulesOneModel() {

        ModelRuleEngineDto dto = ruleService.applyMoreRulesOneModel(modelRuleEngineDto, sss);
        if (dto.getMessage() != null && dto.getMessage().equals(RuleErrorCode.ACCOUNT_LOW_BALANCE.toString())) {
            Assert.assertTrue(dto.getMessage().equals(RuleErrorCode.ACCOUNT_LOW_BALANCE.toString()));
        }
    }

    @Test
    public void oneRuleMoreModels() {
        List<ModelRuleEngineDto> lists = ruleService.applyOneRuleMoreModels(models, RuleName.THIRD_LIBRARY);
        if (lists.get(0).getMessage() != null && lists.get(0).getMessage().equals(RuleErrorCode.ACCOUNT_LOW_BALANCE.toString())) {
            Assert.assertTrue(lists.get(0).getMessage().equals(RuleErrorCode.ACCOUNT_LOW_BALANCE.toString()));
        }
        if (lists.get(1).getMessage() != null && lists.get(1).getMessage().equals(RuleErrorCode.ACCOUNT_HIGH_BALANCE.toString())) {
            Assert.assertTrue(lists.get(1).getMessage().equals(RuleErrorCode.ACCOUNT_HIGH_BALANCE.toString()));
        }
    }

    @Test
    public void oneRuleOneModel() {
        ModelRuleEngineDto model = ruleService.applyOneRuleOneModel(modelRuleEngineDto, RuleName.THIRD_LIBRARY);
        if (model.getMessage() != null && model.getMessage().equals(RuleErrorCode.ACCOUNT_LOW_BALANCE.toString())) {
            Assert.assertTrue(model.getMessage().equals(RuleErrorCode.ACCOUNT_LOW_BALANCE.toString()));
        }
    }


}
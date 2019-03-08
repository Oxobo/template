package nl.tue.base.ruleengine.service;

import nl.tue.base.ruleengineservicedto.dto.RuleDto;

import java.util.List;

public interface RuleService {

    <T extends RuleDto> T applyOneRuleOneModel(T t, String groupName);

    <T extends RuleDto> List<T> applyOneRuleMoreModels(List<T> t, String groupName);

    <T extends RuleDto> T applyMoreRulesOneModel(T model, String[] groupName);

    void reload();

    boolean getStatus();
}

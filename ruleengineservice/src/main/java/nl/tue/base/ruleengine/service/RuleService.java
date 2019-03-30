package nl.tue.base.ruleengine.service;

import nl.tue.base.ruleengineservicedto.dto.RuleDto;

import java.util.List;

public interface RuleService {

    <T extends Object> T applyOneRuleOneModel(T t, String groupName);

    <T extends Object> List<T> applyOneRuleMoreModels(List<T> t, String groupName);

    <T extends Object> T applyMoreRulesOneModel(T model, String[] groupName);

    void reload();

    boolean getStatus();
}

package nl.tue.base.ruleengine.service;

import nl.tue.base.ruleengine.config.KieBaseConfig;
import nl.tue.base.ruleengineservicedto.dto.RuleDto;
import org.kie.api.runtime.KieSession;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RuleServiceImpl extends KieBaseConfig implements RuleService {

    @Override
    public <T extends Object> T applyOneRuleOneModel(T model, String groupName) {
        KieSession kieSession = getSession();
        kieSession.getAgenda().getAgendaGroup(groupName).setFocus();
        kieSession.insert(model);
        kieSession.fireAllRules();
        kieSession.getAgenda().getAgendaGroup(groupName).clear();
        kieSession.dispose();
        return model;
    }

    @Override
    public <T extends Object> List<T> applyOneRuleMoreModels(List<T> models, String groupName) {
        KieSession kieSession = getSession();
        kieSession.getAgenda().getAgendaGroup(groupName).setFocus();
        for (T e : models) {
            kieSession.insert(e);
        }
        kieSession.fireAllRules();
        kieSession.getAgenda().getAgendaGroup(groupName).clear();
        kieSession.dispose();

        return models;
    }

    @Override
    public <T extends Object> T applyMoreRulesOneModel(T model, String[] groupName) {
        KieSession kieSession = getSession();
        for (String s : groupName) {
            kieSession.getAgenda().getAgendaGroup(s).setFocus();
            kieSession.insert(model);
            kieSession.fireAllRules();
            kieSession.getAgenda().getAgendaGroup(s).clear();
        }
        kieSession.dispose();

        return model;
    }

}

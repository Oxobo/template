package ir.itsurena.base.ruleengine.web.rest;

import ir.itsurena.base.ruleengine.service.RuleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class RuleengineController {

    @Resource
    private RuleService ruleService;

    @RequestMapping(value = "/changeStatus" , method = RequestMethod.GET, produces = "application/json" )
    public void changeStatus() {
        ruleService.reload();
    }

    @RequestMapping(value = "/getStatus" , method = RequestMethod.GET, produces = "application/json" )
    public Boolean status() {
       return ruleService.getStatus();
    }


}

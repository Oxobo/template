package nl.tue.base.mq.service;

import nl.tue.base.mq.config.ConfigServiceType;
import nl.tue.base.mq.config.ServiceConfig;

import java.util.Map;

public interface ConfigService {

    //serviceConfig
    ServiceConfig findByCode(Integer serviceCode);

//    Map<Integer, ConfigServiceType> findAllServiceConfig();
//
//    Map<String, String> findAllApplicationConfig();


}

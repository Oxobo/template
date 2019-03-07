package ir.itsurena.base.sima.service;

import ir.itsurena.base.sima.config.ConfigServiceType;
import ir.itsurena.base.sima.config.ServiceConfig;

import java.util.Map;

public interface ConfigService {

    //serviceConfig
    ServiceConfig findByCode(Integer serviceCode);

//    Map<Integer, ConfigServiceType> findAllServiceConfig();
//
//    Map<String, String> findAllApplicationConfig();


}

package nl.tue.base.mq.service;

import nl.tue.base.mq.annotation.HandleException;
import nl.tue.base.mq.config.ConfigServiceType;
import nl.tue.base.mq.config.ServiceConfig;
import nl.tue.base.mq.repository.ApplicationConfigRepository;
import nl.tue.base.mq.repository.ServiceConfigRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ConfigServiceImpl implements ConfigService {


    @Autowired
    private final ServiceConfigRepository serviceConfigRepository;

    @Autowired
    private final ApplicationConfigRepository applicationConfigRepository;

    @Autowired
    public ConfigServiceImpl(ServiceConfigRepository serviceConfigRepository, ApplicationConfigRepository applicationConfigRepository) {
        this.serviceConfigRepository = serviceConfigRepository;
        this.applicationConfigRepository = applicationConfigRepository;
    }


    //serviceConfig
    @Override
    @HandleException
    public ServiceConfig findByCode(Integer serviceCode) {
        return serviceConfigRepository.findByCode(serviceCode);
    }

/*

    @Override
    public Map<Integer, ConfigServiceType> findAllServiceConfig() {
        Map<Integer, ConfigServiceType> map = new HashMap<>();
        serviceConfigRepository.findAll().forEach(item -> map.put(item.getCode(), new ConfigServiceType(item.getValidityTime(), item.getMandatory())));
        return map;
    }

    @Override
    public Map<String, String> findAllApplicationConfig() {
        Map<String, String> map = new HashMap<>();
        applicationConfigRepository.findAll().forEach(item -> map.put(item.getKey(), item.getValue()));
        return map;
    }
*/

}

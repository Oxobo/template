/*
package ir.itsurena.base.sima.config;

import ir.itsurena.base.sima.jms.MessageReceiver;
import ir.itsurena.base.sima.jms.MessageReceiverParameter;
import ir.itsurena.base.sima.service.ConfigService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import javax.jms.JMSException;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Configuration
public class StartupConfig implements CommandLineRunner {

    private static Map<String, String> applicationConfig = null;
    private static Map<Integer, ConfigServiceType> serviceConfig = null;
    private final Logger logger = LogManager.getLogger(StartupConfig.class);
    @Autowired
    private ConfigService configService;
    @Autowired
    private MessageReceiverParameter param;

    public static ConfigServiceType getServiceConfig(Integer key) {
        return serviceConfig.get(key);
    }

    public static String getApplicationConfig(ConfigApplicationType key) {
        return applicationConfig.get(key.name());
    }

    @Override
    public void run(String... args) throws Exception {

        restart();
        int threadPoolSize = 1; //Integer.parseInt(getApplicationConfig(ConfigApplicationType.JMS_LISTENER));
        ExecutorService executorService = Executors.newFixedThreadPool(threadPoolSize);

        for (int i = 0; i < threadPoolSize; i++) {
            try {
                executorService.submit(new MessageReceiver(param));
            } catch (JMSException e) {
                logger.error("!!!jms message receiver %s stopped!!!",i);
            }
        }
    }

    public void restart() {
//        serviceConfig = configService.findAllServiceConfig();
//        applicationConfig = configService.findAllApplicationConfig();
    }
}
*/

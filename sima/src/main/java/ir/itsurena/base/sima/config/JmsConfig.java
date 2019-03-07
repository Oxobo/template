package ir.itsurena.base.sima.config;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class JmsConfig {


    private final Environment env;
    private final Logger logger = LogManager.getLogger(JmsConfig.class);


    @Autowired
    public JmsConfig(Environment env) {
        this.env = env;
    }


    @Autowired
    private ConnectionFactory rabbitConnectionFactory;



    @Bean(name = "receiveQueue")
    public Queue receiveQueue() {
        return new Queue(env.getProperty("surena.receiver.queue"), true);
    }
    @Bean(name = "sendQueue")
    public Queue sendQueue() {
        return new Queue(env.getProperty("surena.sender.queue"), true);
    }


    @Bean
    public RabbitTemplate rabbitTemplate() {
        RabbitTemplate template = new RabbitTemplate(rabbitConnectionFactory);
        template.setRoutingKey("rube.key");
        template.setConnectionFactory(rabbitConnectionFactory);
        return template;
    }

/*    @Bean
    @HandleException
    public MQQueueConnectionFactory mqQueueConnectionFactory() {

        MQQueueConnectionFactory factory = new MQQueueConnectionFactory();

        try {
            factory.setHostName(env.getProperty("surena.mq.host"));
            factory.setTransportType(WMQConstants.WMQ_CM_CLIENT);
            factory.setChannel(env.getProperty("surena.mq.channel"));
            factory.setPort(Integer.parseInt(env.getProperty("surena.mq.port")));
            factory.setQueueManager(env.getProperty("surena.mq.queue-manager"));

        } catch (Exception e) {
            logger.error("can not create mq factory, check mq host, chanel and port");
        }

        return factory;
    }

    @Bean(name = "cachingConnectionFactory")
    public CachingConnectionFactory cachingConnectionFactory(){
        CachingConnectionFactory factory = new CachingConnectionFactory();
        factory.setSessionCacheSize(50);
        factory.setTargetConnectionFactory(mqQueueConnectionFactory());
        factory.setReconnectOnException(true);
        factory.afterPropertiesSet();
        return factory;
    }
    @PostConstruct
    @DependsOn(value = "cachingConnectionFactory")
    public JmsTemplate setJmsConnectionFactory(){
        return new JmsTemplate(this.cachingConnectionFactory());
    }*/


}
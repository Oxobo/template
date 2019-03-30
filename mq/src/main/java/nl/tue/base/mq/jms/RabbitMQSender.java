package nl.tue.base.mq.jms;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQSender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    @Autowired
    private DirectExchange exchange;

    @Autowired
    private Binding binding;

    private static final Logger logger = LogManager.getLogger(MessageReceiver.class);


    public void send(String request) {
        rabbitTemplate.convertAndSend(exchange.getName(), binding.getRoutingKey(), request);
        logger.info("Send msg = " + request);

    }
}

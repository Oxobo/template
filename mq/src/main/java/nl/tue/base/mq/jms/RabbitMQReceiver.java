package nl.tue.base.mq.jms;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.DeliverCallback;
import nl.tue.base.dto.request.AbstractRequestType;
import nl.tue.base.dto.response.AbstractResponseType;
import nl.tue.base.mq.service.LogService;
import nl.tue.base.mq.util.XmlParser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.util.concurrent.TimeoutException;

@Component
public class RabbitMQReceiver {

    @Autowired
    private LogService logService;

    @Autowired
    private Queue queue;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private XmlParser xmlParser;

    private static final Logger logger = LogManager.getLogger(RabbitMQReceiver.class);

    @RabbitListener(queues="${spring.rabbitmq.template.default-receive-queue}")
    public void recievedMessage(String msg) {
        logger.info("*******************");
        logger.info("Recieved Message: " + msg);
        logger.info("*******************");
    }

    public void consume() throws IOException, TimeoutException {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();

        channel.queueDeclare(queue.getName(), false, false, false, null);
        System.out.println(" [*] Waiting for messages. To exit press CTRL+C");

        DeliverCallback deliverCallback = (consumerTag, delivery) -> {
            String message = new String(delivery.getBody(), "UTF-8");
            System.out.println(" [x] Received '" + message + "'");
        };
        channel.basicConsume(queue.getName(), true, deliverCallback, consumerTag -> { });
    }



    public void pullMessage() throws JAXBException {
        logger.info("receiving the message ");
        Object message = rabbitTemplate.receiveAndConvert(queue.getName());

        if (message != null) {


            logger.info("  received message [" + message + "] ");
            AbstractResponseType responseType = xmlParser.unMarshall((String) message, AbstractResponseType.class);
        }
    }
}

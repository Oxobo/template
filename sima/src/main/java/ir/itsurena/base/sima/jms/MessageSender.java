package ir.itsurena.base.sima.jms;

import ir.itsurena.base.sima.annotation.HandleException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {
    private final Logger logger = LogManager.getLogger(MessageSender.class);
    private final ConnectionFactory factory;
    private final Environment propertyUtil;
    private final RabbitTemplate rabbitTemplate;

    @Autowired
    public MessageSender(ConnectionFactory factory, Environment propertyUtil, RabbitTemplate rabbitTemplate) {

        this.factory = factory;
        this.propertyUtil = propertyUtil;
        this.rabbitTemplate = new RabbitTemplate(factory);
    }

    @HandleException
    public void send(String message, String messageId) {

        logger.info(String.format("trying to send message with message-Id '%s' to the central bank...", messageId));
        rabbitTemplate.convertAndSend(propertyUtil.getProperty("surena.mq.sender.queue"), message);
        logger.info(String.format("message with message-Id '%s' send to central bank!", messageId));
        /*
        try {

            logger.info(String.format("trying to send message with message-Id '%s' to the central bank...", messageId));
            initConnection();
            Message msg = session.createTextMessage(message);
            producer.send(msg);
            session.commit();
            logger.info(String.format("message with message-Id '%s' send to central bank!", messageId));

        } catch (JMSException e) {
            if (session != null)
                try {
                    session.rollback();
                } catch (JMSException e1) {
                    logger.error("message send and rollback both failed", e1);
                }

            closeConnection();
        }*/
    }

    private void initConnection() //throws JMSException
    {

/*        if (connection == null || session == null || producer == null) {
            String userName = propertyUtil.getProperty("surena.mq.userName");
            String password = propertyUtil.getProperty("surena.mq.password");

            connection = factory.createQueueConnection(userName, password);
            session = (MQQueueSession) connection.createQueueSession(true, Session.AUTO_ACKNOWLEDGE);

            String senderQueueName = propertyUtil.getProperty("surena.sender.queue");
            Queue producerQueue = session.createQueue(senderQueueName);
            producer = session.createProducer(producerQueue);
            producer.setDeliveryMode(DeliveryMode.PERSISTENT);
        }*/
    }

    private void closeConnection() {

/*
        logger.error("throws exception on sending message...");
        try {

            if (connection != null) {
                logger.error("connection is open, trying to close it...");
                connection.close();
                connection = null;
                logger.error("connection is closed!");
            }

            if (session != null) {
                logger.error("session is open, trying to close it...");
                session.rollback();
                session.close();
                session = null;
                logger.error("session is closed!");
            }

            if (producer != null) {
                logger.error("producer is open, trying to close it...");
                producer.close();
                producer = null;
                logger.error("producer is closed!");
            }

        } catch (JMSException e1) {

            logger.error("!!!! can not close jms connection !!!");
            logger.error("!!!! connection or session or producer is open check what happened !!!");

        }
*/

    }
}

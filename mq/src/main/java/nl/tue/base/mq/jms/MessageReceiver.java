package nl.tue.base.mq.jms;

import nl.tue.base.mq.service.LogService;
import nl.tue.base.mq.util.XmlParser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

public class MessageReceiver implements Runnable {


    @Autowired
    private LogService logService;

    private static final Logger logger = LogManager.getLogger(MessageReceiver.class);

    @Autowired
    private MessageReceiverParameter parameter;
    private final Environment propertyUtil;
    private final ConnectionFactory factory;
    private final XmlParser xmlParser;


    @Autowired
    public MessageReceiver(MessageReceiverParameter parameter) {

        this.factory = parameter.getFactory();
        this.propertyUtil = parameter.getPropertyUtil();
        this.xmlParser = parameter.getXmlParser();


    }

    @RabbitListener(queues = "receiver")
    public void run() {


        logger.info("trying to logged received message into data base...");

        logger.info("received message logged into data base!");


        String logSeperator = "==================================";
/*        try {
                initConnection();
                synchronized (this){
                    Message message =consumer.receive();

                    if (message != null) {
                        TextMessage textMessage = (TextMessage) message;
                        String text = textMessage.getText();
                        textMessage.acknowledge();

                        AbstractResponseType responseType = xmlParser.unMarshall(text, AbstractResponseType.class);
                        String correlationId = responseType.getCorrelationId();
                        logger.info(String.format("receive correlationId %s from central bank!", correlationId));
                        logger.info("trying to logged received message into data base...");
                        logService.insertMqResponseLog(responseType, textMessage);
                        logger.info("received message logged into data base!");

                    }

                }
            } catch (JMSException e) {
                logger.error(logSeperator);
                logger.error("!jms exception!");
                logger.error(e.getMessage());

            } catch (JAXBException e) {

                logger.error(logSeperator);
                logger.error("!can not pars received xml file!");
                logger.error(logSeperator);
                logger.error(e.getMessage());

            }*/


    }

/*    private void initConnection() throws JMSException {

        if (connection == null || consumer == null) {
            String userName = propertyUtil.getProperty("tue.mq.userName");
            String password = propertyUtil.getProperty("tue.mq.password");
            String receiverQueueName = propertyUtil.getProperty("tue.receiver.queue");

            connection = factory.createQueueConnection(userName, password);
            try (MQQueueSession session = (MQQueueSession) connection.createQueueSession(
                          false, Session.AUTO_ACKNOWLEDGE)) {
                Queue queue = session.createQueue(receiverQueueName);

                consumer = session.createConsumer(queue);
            }
            connection.start();
        }
    }*/

}

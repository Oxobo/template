package nl.tue.base.mq.service;

import nl.tue.base.dto.request.AbstractRequestType;
import nl.tue.base.mq.MqManager;
import nl.tue.base.mq.jms.RabbitMQSender;
import nl.tue.base.mq.util.XmlParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MqManagerImpl<T extends AbstractRequestType> implements MqManager {

    @Autowired
    RabbitMQSender rabbitMQSender;
    @Autowired
    XmlParser xmlParser;

    @Override
    public void service(AbstractRequestType request) {
        String xmlMsg = xmlParser.marshall(request);
        rabbitMQSender.send(xmlMsg);
    }
}

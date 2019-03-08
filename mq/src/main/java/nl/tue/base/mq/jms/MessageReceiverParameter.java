package nl.tue.base.mq.jms;

import nl.tue.base.mq.util.XmlParser;
import lombok.Getter;
import lombok.Setter;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;


@Getter
@Setter
@Component
public class MessageReceiverParameter {

    @Autowired
    private ConnectionFactory factory;

    @Autowired
    private Environment propertyUtil;

    @Autowired
    private XmlParser xmlParser;

    public ConnectionFactory getFactory() {
        return factory;
    }

    public void setFactory(ConnectionFactory factory) {
        this.factory = factory;
    }

    public Environment getPropertyUtil() {
        return propertyUtil;
    }

    public void setPropertyUtil(Environment propertyUtil) {
        this.propertyUtil = propertyUtil;
    }

    public XmlParser getXmlParser() {
        return xmlParser;
    }

    public void setXmlParser(XmlParser xmlParser) {
        this.xmlParser = xmlParser;
    }
}

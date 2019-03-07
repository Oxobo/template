package ir.itsurena.base.sima.jms;

import ir.itsurena.base.sima.util.XmlParser;
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


}

package nl.tue.base.mq.util;


import nl.tue.base.dto.request.AbstractRequestType;
import nl.tue.base.dto.response.AbstractResponseType;
import org.springframework.stereotype.Component;

import javax.xml.bind.*;
import javax.xml.namespace.QName;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;



@Component
public class XmlParser {

    //from object to xml text
    public String marshall(AbstractRequestType object) throws JAXBException{

        JAXBContext context = JAXBContext.newInstance(object.getClass());
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        marshaller.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

        QName rootElementName = new QName(object.getClass().getSimpleName());
        JAXBElement<AbstractRequestType> rootElement = new JAXBElement<>(rootElementName,AbstractRequestType.class,object);

        StringWriter writer = new StringWriter();

        marshaller.marshal(rootElement, writer);

        return String.valueOf(writer);
    }

    //from xml text to object
    public AbstractResponseType unMarshall(String message, Class type) throws JAXBException {

        StringReader reader = new StringReader(message);

        JAXBContext context = JAXBContext.newInstance(type);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        return (AbstractResponseType) unmarshaller.unmarshal(reader);

    }
}

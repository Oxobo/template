package ir.itsurena.base.sima.util;


import ir.itsurena.base.sima.annotation.OptionalMQTag;
import ir.itsurena.base.dto.request.AbstractRequestType;
import ir.itsurena.base.dto.response.AbstractResponseType;
import org.springframework.stereotype.Component;

import javax.xml.bind.*;
import javax.xml.namespace.QName;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;



@Component
public class XmlParser {


    private void setValueOnAnnotatedFields(Object target) {
        if (target != null) {
            // traversing the type hierarchy upward to process fields declared in classes target's class extends
            Class<?> clazz = target.getClass();
            do {
                setValueOnAnnotatedDeclaredFields(target, clazz);
            }
            while ((clazz = clazz.getSuperclass()) != null);
        }
    }

    private void setValueOnAnnotatedDeclaredFields(Object target, Class<?> clazz) {
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(OptionalMQTag.class)) {
                set(field, target, null);
            } else if (!field.getType().isPrimitive() && !field.getType().isArray()) {
                setValueOnAnnotatedFields(get(field, target));
            }
        }
    }

    private void set(Field field, Object target, String value) {
        try {
            makeFieldAccessibleNotFinal(field);
            field.set(target, value);
        } catch (Exception e) {
            String message = String.format("Failed to set the value on field %s", target.getClass().getSimpleName() + "." + field.getName());
            throw new IllegalStateException(message, e);
        }
    }

    private Object get(Field field, Object target) {
        try {
            makeFieldAccessibleNotFinal(field);
            return field.get(target);
        } catch (Exception e) {
            String message = String.format("Failed to get the value on field %s", target.getClass().getSimpleName() + "." + field.getName());
            throw new IllegalStateException(message, e);
        }
    }

    private void makeFieldAccessibleNotFinal(Field field) {
        try {
            Field modifiersField = Field.class.getDeclaredField("modifiers");
            modifiersField.setAccessible(true);
            modifiersField.setInt(field, field.getModifiers() & ~Modifier.FINAL);
        } catch (Exception e) {
            String message = String.format("Failed to remove final declaration of field %s", field.getName());
            throw new IllegalStateException(message, e);
        }
        try {
            field.setAccessible(true);
        } catch (Exception e) {
            String message = String.format("Failed to make field %s accessible", field.getName());
            throw new IllegalStateException(message, e);
        }
    }

    //from object to xml text
    public String marshall(AbstractRequestType object) throws JAXBException{

        setValueOnAnnotatedFields(object);

        JAXBContext context = JAXBContext.newInstance(object.getClass());
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        marshaller.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

        QName rootElementName = new QName("http://www.w3.org/2001/XMLSchema",
                object.getClass().getSimpleName(),"");
        JAXBElement<AbstractRequestType> rootElement = new JAXBElement<>(rootElementName,AbstractRequestType.class,object);

        StringWriter writer = new StringWriter();

        marshaller.marshal(rootElement, writer);

        return String.valueOf(writer);
    }

    //from object to xsd text
    public String generateXsd(AbstractRequestType object) throws JAXBException, IOException {

        setValueOnAnnotatedFields(object);

        JAXBContext context = JAXBContext.newInstance(object.getClass());

        SchemaOutputResolver sor = new SchemaOutputResolverBuilder();

        context.generateSchema(sor);

        return ((SchemaOutputResolverBuilder) sor).result.getWriter().toString();
    }



    //from xml text to object
    public AbstractResponseType unMarshall(String message, Class type) throws JAXBException {

        StringReader reader = new StringReader(message);

        JAXBContext context = JAXBContext.newInstance(type);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        return (AbstractResponseType) unmarshaller.unmarshal(reader);

    }
}

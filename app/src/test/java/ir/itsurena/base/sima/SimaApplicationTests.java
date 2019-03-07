package ir.itsurena.base.sima;

import ir.itsurena.base.dto.library.PrincipalType;
import ir.itsurena.base.dto.request.PingRequestType;
import ir.itsurena.base.sima.dto.xml.general.SimaObjectFactory;
import ir.itsurena.base.sima.jms.MessageSender;
import ir.itsurena.base.sima.request.PingRequestService;
import ir.itsurena.base.sima.service.LogService;
import ir.itsurena.base.sima.util.XmlParser;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.stream.XMLStreamException;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest
@ComponentScan("ir.itsurena.base")
public class SimaApplicationTests {

    @Autowired
    XmlParser xmlParser;
    @Autowired
    private MessageSender messageSender;

    @Autowired
    PingRequestService pingRequestService;

    @Autowired
    private LogService logService;


    @Test
    public void contextLoads() {
    }


    @Test
    public void createXsdAbstractRequestType() throws XMLStreamException {

        PrincipalType principalType = new PrincipalType();
        principalType.setUsername("jafar");
        principalType.setPassword("jafar");
        principalType.setBranchCode("12");
        PingRequestType pingRequestType = pingRequestService.createType();
        pingRequestType.setPrincipal(principalType);
        pingRequestType.setVersion("2.0");
        pingRequestType.setMessageId(UUID.randomUUID().toString());
        pingRequestType.setTest(true);
        File f = new File("realRequest.xml");
        try {
            String re = xmlParser.generateXsd(pingRequestType);

            FileUtils.writeStringToFile(f, re, "UTF-8");
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void createPingReqWithServices() throws XMLStreamException {

        PingRequestType type = pingRequestService.createType();
        PrincipalType principalType = new PrincipalType();
        principalType.setUsername("jafar");
        principalType.setPassword("jafar");
        principalType.setBranchCode("12");
        type.setPrincipal(principalType);
        type.setVersion("2.0");
        type.setMessageId(UUID.randomUUID().toString());
        type.setTest(true);
        JAXBElement<PingRequestType> element = pingRequestService.createElement(type);
        Assert.assertNotNull(type);

    }
    @Test
    public void createXsdAbstractRequestTypeInsertDB() throws XMLStreamException {

        PrincipalType principalType = new PrincipalType();
        principalType.setUsername("jafar");
        principalType.setPassword("jafar");
        principalType.setBranchCode("12");
        PingRequestType pingRequestType = new PingRequestType();
        pingRequestType.setPrincipal(principalType);
        pingRequestType.setVersion("2.0");
        pingRequestType.setMessageId(UUID.randomUUID().toString());
        pingRequestType.setTest(true);
        File f = new File("realRequest.xml");
        try {
            String re = xmlParser.generateXsd(pingRequestType);
            logService.insertSimaRequestLog(pingRequestType, re);
            FileUtils.writeStringToFile(f, re, "UTF-8");
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void createXsdRequestType() throws XMLStreamException {


        PrincipalType principalType = new PrincipalType();
        principalType.setUsername("jafar");
        principalType.setPassword("jafar");
        principalType.setBranchCode("12");
        PingRequestType pingRequestType = new PingRequestType();
        pingRequestType.setPrincipal(principalType);
        pingRequestType.setVersion("2.0");
        pingRequestType.setMessageId(UUID.randomUUID().toString());
        pingRequestType.setTest(true);

        SimaObjectFactory simaObjectFactory = new SimaObjectFactory();
        JAXBElement<PingRequestType> pingRequestTypeJAXBElement = simaObjectFactory.createPingRequest(pingRequestType);
        PingRequestType pingRequest = pingRequestTypeJAXBElement.getValue();
        File f = new File("realRequest.xml");
        try {
            String re = xmlParser.generateXsd(pingRequest);

            FileUtils.writeStringToFile(f, re, "UTF-8");
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void createXmlRequestType() throws XMLStreamException {


        PrincipalType principalType = new PrincipalType();
        principalType.setUsername("jafar");
        principalType.setPassword("jafar");
        principalType.setBranchCode("12");
        PingRequestType pingRequestType = new PingRequestType();
        pingRequestType.setPrincipal(principalType);
        pingRequestType.setVersion("2.0");
        pingRequestType.setMessageId(UUID.randomUUID().toString());
        pingRequestType.setTest(true);

        SimaObjectFactory simaObjectFactory = new SimaObjectFactory();
        JAXBElement<PingRequestType> pingRequestTypeJAXBElement = simaObjectFactory.createPingRequest(pingRequestType);
        PingRequestType pingRequest = pingRequestTypeJAXBElement.getValue();

        File f = new File("PrincipalType.xml");
        try {
            String re = xmlParser.marshall(pingRequest);

            FileUtils.writeStringToFile(f, re, "UTF-8");
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void testSendMessage() {
        messageSender.send("helo jms", "34");
    }

}


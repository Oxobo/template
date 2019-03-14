package nl.tue.base.mq;

import nl.tue.base.dto.library.PrincipalType;
import nl.tue.base.dto.request.PingRequestType;
import nl.tue.base.mq.dto.xml.general.MqObjectFactory;
import nl.tue.base.mq.jms.RabbitMQSender;
import nl.tue.base.mq.request.PingRequestService;
import nl.tue.base.mq.service.LogService;
import nl.tue.base.mq.util.XmlParser;
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
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.stream.XMLStreamException;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.GregorianCalendar;
import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest
@ComponentScan("nl.tue.base")
public class MqApplicationTests {

    @Autowired
    XmlParser xmlParser;

    @Autowired
    private RabbitMQSender rabbitMQSender;

    @Autowired
    PingRequestService pingRequestService;

    @Autowired
    CreateOrganizationRequestService createOrganizationRequestService;

    @Autowired
    UpdateOrganizationRequestService updateOrganizationRequestService;

    @Autowired
    GetOrganizationByIdentifierRequestService getOrganizationByIdentifierRequestService;

    @Autowired
    GetOrganizationsByNameRequestService getOrganizationsByNameRequestService;

    @Autowired
    CreatePersonRequestService createPersonRequestService;

    @Autowired
    UpdatePersonRequestService updatePersonRequestService;

    @Autowired
    GetPersonsByNameRequestService getPersonsByNameRequestService;

    @Autowired
    GetPersonByIdentifierRequestService getPersonByIdentifierRequestService;

    @Autowired
    UnblockAccountRequestService unblockAccountRequestService;

    @Autowired
    BlockAccountRequestService blockAccountRequestService;

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
            logService.insertMqRequestLog(pingRequestType, re);
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

        MqObjectFactory mqObjectFactory = new MqObjectFactory();
        JAXBElement<PingRequestType> pingRequestTypeJAXBElement = mqObjectFactory.createPingRequest(pingRequestType);
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

        MqObjectFactory mqObjectFactory = new MqObjectFactory();
        JAXBElement<PingRequestType> pingRequestTypeJAXBElement = mqObjectFactory.createPingRequest(pingRequestType);
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
    public void testSendMessageToRabbitMQ() {
        rabbitMQSender.send("helo from jms to rabitt mQ");
    }

    private PaginationType createPaginationObj() {
        PaginationType paginationType = new PaginationType();
        paginationType.setPageNumber(5);
        paginationType.setPageSize(20);
        return paginationType;
    }

    public XMLGregorianCalendar convertToXmlGregorianCalendar(LocalDate localDate) throws DatatypeConfigurationException {
        GregorianCalendar gcal = GregorianCalendar.from(localDate.atStartOfDay(ZoneId.systemDefault()));
        XMLGregorianCalendar xcal = DatatypeFactory.newInstance().newXMLGregorianCalendar(gcal);
        return xcal;
    }


}


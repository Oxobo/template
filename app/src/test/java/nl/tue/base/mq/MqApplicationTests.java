 package nl.tue.base.mq;

 import nl.tue.base.dto.library.*;
 import nl.tue.base.dto.request.*;
 import nl.tue.base.dto.response.AbstractResponseType;
 import nl.tue.base.mq.jms.RabbitMQReceiver;
 import nl.tue.base.mq.jms.RabbitMQSender;
 import nl.tue.base.mq.request.*;
 import nl.tue.base.mq.service.LogService;
 import nl.tue.base.mq.util.XmlParser;
 import org.apache.commons.io.FileUtils;
 import org.hamcrest.CoreMatchers;
 import org.junit.Assert;
 import org.junit.Test;
 import org.junit.runner.RunWith;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.boot.test.context.SpringBootTest;
 import org.springframework.context.annotation.ComponentScan;
 import org.springframework.test.context.junit4.SpringRunner;

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
    RabbitMQReceiver rabbitMQReceiver;

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
    public void pingReqTest() throws XMLStreamException {

        PrincipalType principalType = createPrincipalType();
        PingRequestType pingRequestType = pingRequestService.createType();
        pingRequestType.setPrincipal(principalType);
        setAbstractRequestType(pingRequestType);
        String makeXmlOfPingRequest = makeXmlOf(pingRequestType);
        rabbitMQSender.send(makeXmlOfPingRequest);
        Assert.assertNotNull("xml not generated", makeXmlOfPingRequest);
        Assert.assertThat("There should at least be a tag in xml with name of request class", makeXmlOfPingRequest,
                CoreMatchers.containsString("</"
                        + pingRequestType.getClass().getSimpleName()
                        + ">"));
    }

    @Test
    public void createOrganizationRequestTest() throws DatatypeConfigurationException {
        CreateOrganizationRequestType createOrganization =
                createOrganizationRequestService.createType();
        PrincipalType principalType = createPrincipalType();
        createOrganization.setPrincipal(principalType);
        IdentifierType identifierType = generateIdentifierType(IdentifierClassType.NATIONAL_ID, "0403157919");
        createOrganization.setIdentifier(identifierType);
        createOrganization.setCompanyType(OrganizationClassType.OTHER);
        createOrganization.setDealerCode("13456");
        createOrganization.setIsoName("ISO_NAME");
        createOrganization.setName("sample_test");
        createOrganization.setRegisterCode("000");
        createOrganization.setRegisterLocation("CityX");
        createOrganization.setRegisterDate(
                convertToXmlGregorianCalendar(
                        LocalDate.of(1987,12,25)));
        setAbstractRequestType(createOrganization);

        String xmlOfcreateOrganization = makeXmlOf(createOrganization);
        rabbitMQSender.send(xmlOfcreateOrganization);
        Assert.assertNotNull("xml not generated", xmlOfcreateOrganization);
        Assert.assertThat("There should at least be a tag in xml with name of request class", xmlOfcreateOrganization,
                CoreMatchers.containsString("</"
                        + createOrganization.getClass().getSimpleName()
                        + ">"));

    }

    @Test
    public void updateOrganizationRequestTest() throws DatatypeConfigurationException {
        UpdateOrganizationRequestType updateOrganizationReq = updateOrganizationRequestService.createType();
        PrincipalType principalType = createPrincipalType();
        updateOrganizationReq.setPrincipal(principalType);
        IdentifierType identifierType = generateIdentifierType(IdentifierClassType.NATIONAL_ID, "0403157919");
        updateOrganizationReq.setIdentifier(identifierType);
        updateOrganizationReq.setIsoName("IsoNameTest");
        updateOrganizationReq.setName("NameNameTest");
        updateOrganizationReq.setRegisterDate(convertToXmlGregorianCalendar(
                LocalDate.of(1995,12,25)));
        updateOrganizationReq.setCompanyType(OrganizationClassType.PRIVATE);
        setAbstractRequestType(updateOrganizationReq);

        String xmlOfUpdateOrganizationReq = makeXmlOf(updateOrganizationReq);
        rabbitMQSender.send(xmlOfUpdateOrganizationReq);
        Assert.assertNotNull("xml not generated", xmlOfUpdateOrganizationReq);
        Assert.assertThat("There should at least be a tag in xml with name of request class", xmlOfUpdateOrganizationReq,
                CoreMatchers.containsString("</"
                        + updateOrganizationReq.getClass().getSimpleName()
                        + ">"));
    }

    @Test
    public void getOrganizationByIdentifierRequestTest(){
        GetOrganizationByIdentifierRequestType organizationByIdentifier
                = getOrganizationByIdentifierRequestService.createType();
        IdentifierType identifierType = generateIdentifierType(IdentifierClassType.NATIONAL_ID, "0403157919");
        organizationByIdentifier.setIdentifier(identifierType);
        setAbstractRequestType(organizationByIdentifier);

        String xmlOfOrganizationByIdentifier = makeXmlOf(organizationByIdentifier);
        rabbitMQSender.send(xmlOfOrganizationByIdentifier);
        Assert.assertNotNull("xml not generated", xmlOfOrganizationByIdentifier);
        Assert.assertThat("There should at least be a tag in xml with name of request class",
                xmlOfOrganizationByIdentifier,
                CoreMatchers.containsString("</"
                        + organizationByIdentifier.getClass().getSimpleName()
                        + ">"));

    }

    @Test
    public void getOrganizationsByNameRequestTest(){
        GetOrganizationsByNameRequestType organizationsByName
                = getOrganizationsByNameRequestService.createType();
        setAbstractRequestType(organizationsByName);
        PaginationType paginationType = createPaginationObj();
        organizationsByName.setName("Digi");
        organizationsByName.setPagination(paginationType);
        String xmlOfOrganizationByName = makeXmlOf(organizationsByName);
        rabbitMQSender.send(xmlOfOrganizationByName);
        Assert.assertNotNull("xml not generated", xmlOfOrganizationByName);
        Assert.assertThat("There should at least be a tag in xml with name of request class",
                xmlOfOrganizationByName,
                CoreMatchers.containsString("</"
                        + organizationsByName.getClass().getSimpleName()
                        + ">"));


    }

    @Test
    public void createPersonRequestServiceTest() throws DatatypeConfigurationException {
        CreatePersonRequestType personRequestType = createPersonRequestService.createType();
        IdentifierType identifierType = generateIdentifierType(IdentifierClassType.NATIONAL_ID, "0991105206");
        personRequestType.setIdentifier(identifierType);
        personRequestType.setFirstName("Fname");
        personRequestType.setLastName("Lname");
        personRequestType.setBirthDate(convertToXmlGregorianCalendar(LocalDate.of(1987,12,25)));
        personRequestType.setGender(GenderType.MALE);

        String xmlOfPersonReq = makeXmlOf(personRequestType);
        rabbitMQSender.send(xmlOfPersonReq);
        Assert.assertNotNull("xml not generated", xmlOfPersonReq);
        Assert.assertThat("There should at least be a tag in xml with name of request class",
                xmlOfPersonReq,
                CoreMatchers.containsString("</"
                        + personRequestType.getClass().getSimpleName()
                        + ">"));

    }

    @Test
    public void updatePersonRequestServiceTest() throws DatatypeConfigurationException {
        UpdatePersonRequestType updatePersonRequestType = updatePersonRequestService.createType();
        IdentifierType identifierType = generateIdentifierType(IdentifierClassType.NATIONAL_ID, "0991105206");
        updatePersonRequestType.setIdentifier(identifierType);
        updatePersonRequestType.setFirstName("Fname");
        updatePersonRequestType.setLastName("Lname");
        updatePersonRequestType.setBirthDate(convertToXmlGregorianCalendar(LocalDate.of(1987,12,25)));
        updatePersonRequestType.setGender(GenderType.MALE);
        String xmlOfupdatePersonRequestType = makeXmlOf(updatePersonRequestType);
        rabbitMQSender.send(xmlOfupdatePersonRequestType);
        Assert.assertNotNull("xml not generated", xmlOfupdatePersonRequestType);
        Assert.assertThat("There should at least be a tag in xml with name of request class",
                xmlOfupdatePersonRequestType,
                CoreMatchers.containsString("</"
                        + updatePersonRequestType.getClass().getSimpleName()
                        + ">"));
    }

    @Test
    public void getPersonsByNameRequestTest() throws DatatypeConfigurationException {
        GetPersonsByNameRequestType personsByNameRequestType
                = getPersonsByNameRequestService.createType();
        personsByNameRequestType.setFirstName("Fname");
        personsByNameRequestType.setLastName("Lname");
        PaginationType paginationType = createPaginationObj();
        personsByNameRequestType.setPagination(paginationType);
        String xmlOfpersonsByNameRequestType = makeXmlOf(personsByNameRequestType);
        rabbitMQSender.send(xmlOfpersonsByNameRequestType);
        Assert.assertNotNull("xml not generated", xmlOfpersonsByNameRequestType);
        Assert.assertThat("There should at least be a tag in xml with name of request class",
                xmlOfpersonsByNameRequestType,
                CoreMatchers.containsString("</"
                        + personsByNameRequestType.getClass().getSimpleName()
                        + ">"));
    }

    @Test
    public void getPersonsByIdentifierRequestTest() throws DatatypeConfigurationException {
        GetPersonByIdentifierRequestType personByIdentifierRequestType
                = getPersonByIdentifierRequestService.createType();
        setAbstractRequestType(personByIdentifierRequestType);
        IdentifierType identifierType = generateIdentifierType(IdentifierClassType.FIDA, "123546");
        personByIdentifierRequestType.setIdentifier(identifierType);
        String xmlOfpersonByIdentifierRequest = makeXmlOf(personByIdentifierRequestType);
        rabbitMQSender.send(xmlOfpersonByIdentifierRequest);
        Assert.assertNotNull("xml not generated", xmlOfpersonByIdentifierRequest);
        Assert.assertThat("There should at least be a tag in xml with name of request class",
                xmlOfpersonByIdentifierRequest,
                CoreMatchers.containsString("</"
                        + personByIdentifierRequestType.getClass().getSimpleName()
                        + ">"));

    }

    @Test
    public void unblockAccountReqTest(){
        UnblockAccountRequestType unblockAccountReq =
                unblockAccountRequestService.createType();
        setAbstractRequestType(unblockAccountReq);
        unblockAccountReq.setAccountNumber("111");
        String xmlOfUnblockAccountReq = makeXmlOf(unblockAccountReq);
        rabbitMQSender.send(xmlOfUnblockAccountReq);
        Assert.assertNotNull("xml not generated", xmlOfUnblockAccountReq);
        Assert.assertThat("There should at least be a tag in xml with name of request class",
                xmlOfUnblockAccountReq,
                CoreMatchers.containsString("</"
                        + unblockAccountReq.getClass().getSimpleName()
                        + ">"));
    }

    @Test
    public void blockAccountReqTest(){
        BlockAccountRequestType blockAccountReq =
                blockAccountRequestService.createType();
        setAbstractRequestType(blockAccountReq);
        blockAccountReq.setAccountNumber("111");
        String xmlOfBlockAccountReq = makeXmlOf(blockAccountReq);
        rabbitMQSender.send(xmlOfBlockAccountReq);
        Assert.assertNotNull("xml not generated", xmlOfBlockAccountReq);
        Assert.assertThat("There should at least be a tag in xml with name of request class",
                xmlOfBlockAccountReq,
                CoreMatchers.containsString("</"
                        + blockAccountReq.getClass().getSimpleName()
                        + ">"));
    }

    private IdentifierType generateIdentifierType(IdentifierClassType type, String value) {
        IdentifierType identifierType = new IdentifierType();
        identifierType.setType(type);
        identifierType.setValue(value);
        return identifierType;
    }

    private PaginationType createPaginationObj() {
        PaginationType paginationType = new PaginationType();
        paginationType.setPageNumber(5);
        paginationType.setPageSize(20);
        return paginationType;
    }

    private String makeXmlOf(AbstractRequestType abstractRequestType) {
        File f = new File("F_" + abstractRequestType.getClass().getSimpleName() + ".xml");
        String xmlRequest = "";
        try {
            xmlRequest = xmlParser.marshall(abstractRequestType);
            logService.insertMqRequestLog(abstractRequestType, xmlRequest);
            FileUtils.writeStringToFile(f, xmlRequest, "UTF-8");
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return xmlRequest;
    }

    public PrincipalType createPrincipalType(){
        return createPrincipalType("TestUser", "PASSWORD", "12");
    }

    public PrincipalType createPrincipalType(String username, String password, String branchCode){
        PrincipalType principalType = new PrincipalType();
        principalType.setUsername(username);
        principalType.setPassword(password);
        principalType.setBranchCode(branchCode);
        return principalType;
    }

    public XMLGregorianCalendar convertToXmlGregorianCalendar(LocalDate localDate) throws DatatypeConfigurationException {
        GregorianCalendar gcal = GregorianCalendar.from(localDate.atStartOfDay(ZoneId.systemDefault()));
        XMLGregorianCalendar xcal = DatatypeFactory.newInstance().newXMLGregorianCalendar(gcal);
        return xcal;
    }

    public void setAbstractRequestType(AbstractRequestType abstractRequestType){
        abstractRequestType.setMessageId(UUID.randomUUID().toString());
        abstractRequestType.setTest(true);
        abstractRequestType.setVersion("2.0");
    }

    public void setAbstractResponseType(AbstractResponseType abstractResponseType){
        abstractResponseType.setAck(AckCodeType.SUCCESS);
        abstractResponseType.setCorrelationId(UUID.randomUUID().toString());

    }
}


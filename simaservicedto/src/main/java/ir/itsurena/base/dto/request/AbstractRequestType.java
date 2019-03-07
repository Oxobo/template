/*
 This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
 See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
 Any modifications to this file will be lost upon recompilation of the source schema.
 Generated on: 2019.02.04 at 11:12:06 AM IRST
*/



package ir.itsurena.base.dto.request;

import ir.itsurena.base.dto.library.PrincipalType;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for AbstractRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Principal" type="{http://modernisc.com/api/csd}PrincipalType"/>
 *         &lt;element name="MessageId" type="{http://modernisc.com/api/csd}GUID"/>
 *         &lt;element name="Test" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Version" type="{http://modernisc.com/api/csd}SupportedVersions"/>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractRequestType", propOrder = {
    "principal",
    "messageId",
    "test",
    "version",
    "any"
})
@XmlRootElement
@XmlSeeAlso({
    PingRequestType.class,
    ApproveResaleSecuritiesRequestType.class,
    UnblockAccountRequestType.class,
    UnblockPartyRequestType.class,
    BlockPartyRequestType.class,
    ApproveRedemptionSecuritiesRequestType.class,
    GetRedemptionInterestRequestType.class,
    GetSecuritiesCodesForResaleRequestType.class,
    CancelRedemptionSecuritiesRequestType.class,
    CreatePersonRequestType.class,
    GetPersonsByNameRequestType.class,
    GetOrganizationsByNameRequestType.class,
    GetSecuritiesCodesForSaleRequestType.class,
    TransferSecuritiesRequestType.class,
    CancelResaleSecuritiesRequestType.class,
    GetSecuritiesCouponsDateRequestType.class,
    GetAccountsRequestType.class,
    GetSecuritiesCodesForRedemptionRequestType.class,
    CreateOrganizationRequestType.class,
    GetSecuritiesForRedemptionRequestType.class,
    PartialUnblockAccountRequestType.class,
    GetSalesInterestRequestType.class,
    RedemptionSecuritiesRequestType.class,
    ResaleSecuritiesRequestType.class,
    ReverseTransactionRequestType.class,
    UpdatePersonRequestType.class,
    GetOrganizationByIdentifierRequestType.class,
    ApproveSaleSecuritiesRequestType.class,
    GetSecuritiesForTransferRequestType.class,
    GetAllocatedSecuritiesRequestType.class,
    ApproveTransferSecuritiesRequestType.class,
    GetSecuritiesForResaleRequestType.class,
    CancelSaleSecuritiesRequestType.class,
    BlockAccountRequestType.class,
    GetAllocatedSecuritiesCodesRequestType.class,
    UpdateIbanRequestType.class,
    UpdateOrganizationRequestType.class,
    CancelTransferSecuritiesRequestType.class,
    PartialBlockAccountRequestType.class,
    GetResaleInterestRequestType.class,
    GetSecuritiesCodesForTransferRequestType.class,
    GetPersonByIdentifierRequestType.class,
    GetSecuritiesForSaleRequestType.class,
    SaleSecuritiesRequestType.class
})
@Getter
@Setter
public abstract class AbstractRequestType {

    @XmlElement(name = "Principal", required = true)
    protected PrincipalType principal;

    @XmlElement(name = "MessageId", required = true)
    protected String messageId;

    @XmlElement(name = "Test", defaultValue = "false")
    protected boolean test;

    @XmlElement(name = "Version", required = true, defaultValue = "2.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String version;

    @XmlAnyElement(lax = true)
    @Setter(AccessLevel.NONE)
    protected List<Object> any;

    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }

    public PrincipalType getPrincipal() {
        return principal;
    }

    public void setPrincipal(PrincipalType principal) {
        this.principal = principal;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public boolean isTest() {
        return test;
    }

    public void setTest(boolean test) {
        this.test = test;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setAny(List<Object> any) {
        this.any = any;
    }
}

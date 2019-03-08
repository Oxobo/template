//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.04 at 11:12:06 AM IRST 
//


package nl.tue.base.dto.library;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OrganizationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganizationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Identifier" type="{http://modernisc.com/api/csd}IdentifierType" minOccurs="0"/>
 *         &lt;element name="RegisterCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DealerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsoName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegisterDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="CompanyType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://modernisc.com/api/csd}OrganizationClassType">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RegisterLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyStatus" type="{http://modernisc.com/api/csd}PartyStatusType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationType", propOrder = {
    "identifier",
    "registerCode",
    "dealerCode",
    "isoName",
    "name",
    "registerDate",
    "companyType",
    "registerLocation",
    "partyStatus"
})
public class OrganizationType {

    @XmlElement(name = "Identifier")
    protected IdentifierType identifier;
    @XmlElement(name = "RegisterCode")
    protected String registerCode;
    @XmlElement(name = "DealerCode")
    protected String dealerCode;
    @XmlElement(name = "IsoName")
    protected String isoName;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "RegisterDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar registerDate;
    @XmlElement(name = "CompanyType")
    protected OrganizationClassType companyType;
    @XmlElement(name = "RegisterLocation")
    protected String registerLocation;
    @XmlElement(name = "PartyStatus")
    protected PartyStatusType partyStatus;

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    public IdentifierType getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    public void setIdentifier(IdentifierType value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the registerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisterCode() {
        return registerCode;
    }

    /**
     * Sets the value of the registerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisterCode(String value) {
        this.registerCode = value;
    }

    /**
     * Gets the value of the dealerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealerCode() {
        return dealerCode;
    }

    /**
     * Sets the value of the dealerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealerCode(String value) {
        this.dealerCode = value;
    }

    /**
     * Gets the value of the isoName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsoName() {
        return isoName;
    }

    /**
     * Sets the value of the isoName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsoName(String value) {
        this.isoName = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the registerDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegisterDate() {
        return registerDate;
    }

    /**
     * Sets the value of the registerDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegisterDate(XMLGregorianCalendar value) {
        this.registerDate = value;
    }

    /**
     * Gets the value of the companyType property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationClassType }
     *     
     */
    public OrganizationClassType getCompanyType() {
        return companyType;
    }

    /**
     * Sets the value of the companyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationClassType }
     *     
     */
    public void setCompanyType(OrganizationClassType value) {
        this.companyType = value;
    }

    /**
     * Gets the value of the registerLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisterLocation() {
        return registerLocation;
    }

    /**
     * Sets the value of the registerLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisterLocation(String value) {
        this.registerLocation = value;
    }

    /**
     * Gets the value of the partyStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PartyStatusType }
     *     
     */
    public PartyStatusType getPartyStatus() {
        return partyStatus;
    }

    /**
     * Sets the value of the partyStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyStatusType }
     *     
     */
    public void setPartyStatus(PartyStatusType value) {
        this.partyStatus = value;
    }

}
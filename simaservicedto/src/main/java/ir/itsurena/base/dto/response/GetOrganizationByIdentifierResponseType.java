
/*
 This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
 See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
 Any modifications to this file will be lost upon recompilation of the source schema.
 Generated on: 2019.02.04 at 11:12:06 AM IRST
*/



package ir.itsurena.base.dto.response;

import ir.itsurena.base.dto.library.OrganizationType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetOrganizationByIdentifierResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetOrganizationByIdentifierResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://modernisc.com/api/csd}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="Organization" type="{http://modernisc.com/api/csd}OrganizationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetOrganizationByIdentifierResponseType", propOrder = {
    "organization"
})
public class GetOrganizationByIdentifierResponseType
    extends AbstractResponseType {

    @XmlElement(name = "Organization")
    protected OrganizationType organization;

    /**
     * Gets the value of the organization property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationType }
     *     
     */
    public OrganizationType getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationType }
     *     
     */
    public void setOrganization(OrganizationType value) {
        this.organization = value;
    }

}

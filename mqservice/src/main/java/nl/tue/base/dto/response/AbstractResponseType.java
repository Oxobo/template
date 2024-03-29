
/*
 This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
 See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
 Any modifications to this file will be lost upon recompilation of the source schema.
 Generated on: 2019.02.04 at 11:12:06 AM IRST
*/



package nl.tue.base.dto.response;

import nl.tue.base.dto.library.AckCodeType;
import nl.tue.base.dto.library.ErrorType;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for AbstractResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Ack" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://modernisc.com/api/csd}AckCodeType">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CorrelationId" type="{http://modernisc.com/api/csd}GUID" minOccurs="0"/>
 *         &lt;element name="Errors" type="{http://modernisc.com/api/csd}ErrorType"
 *              maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "AbstractResponseType", propOrder = {
    "ack",
    "correlationId",
    "errors",
    "any"
})
@XmlSeeAlso({
    PingResponseType.class,
    CreatePersonResponseType.class,
    UpdatePersonResponseType.class,
    GetOrganizationByIdentifierResponseType.class,
    BlockAccountResponseType.class,
    UpdateOrganizationResponseType.class,
    UnblockAccountResponseType.class,
    CreateOrganizationResponseType.class,
    GetPersonsByNameResponseType.class,
    GetPersonByIdentifierResponseType.class,
    GetOrganizationsByNameResponseType.class
})
@Getter
@Setter
public abstract class AbstractResponseType {

    @XmlElement(name = "Ack")
    protected AckCodeType ack;

    @XmlElement(name = "CorrelationId")
    protected String correlationId;

    @XmlElement(name = "Errors")
    @Setter(AccessLevel.NONE)
    protected List<ErrorType> errors;

    @XmlAnyElement(lax = true)
    @Setter(AccessLevel.NONE)
    protected List<Object> any;

    public List<ErrorType> getErrors() {
        if (errors == null) {
            errors = new ArrayList<>();
        }
        return this.errors;
    }

    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }

    public AckCodeType getAck() {
        return ack;
    }

    public void setAck(AckCodeType ack) {
        this.ack = ack;
    }

    public String getCorrelationId() {
        return correlationId;
    }

    public void setCorrelationId(String correlationId) {
        this.correlationId = correlationId;
    }

    public void setErrors(List<ErrorType> errors) {
        this.errors = errors;
    }

    public void setAny(List<Object> any) {
        this.any = any;
    }
}

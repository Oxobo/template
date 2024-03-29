
/*
 This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
 See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
 Any modifications to this file will be lost upon recompilation of the source schema.
 Generated on: 2019.02.04 at 11:12:06 AM IRST
*/



package nl.tue.base.dto.response;

import nl.tue.base.dto.library.PaginationResultType;
import nl.tue.base.dto.library.PersonType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for GetPersonsByNameResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetPersonsByNameResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://modernisc.com/api/csd}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="Persons" type="{http://modernisc.com/api/csd}PersonType"
 *                     maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Pagination" type="{http://modernisc.com/api/csd}PaginationResultType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetPersonsByNameResponseType", propOrder = {
    "persons",
    "pagination"
})
public class GetPersonsByNameResponseType
    extends AbstractResponseType {

    @XmlElement(name = "Persons")
    protected List<PersonType> persons;
    @XmlElement(name = "Pagination")
    protected PaginationResultType pagination;

    /**
     * Gets the value of the persons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the persons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonType }
     * 
     * 
     */
    public List<PersonType> getPersons() {
        if (persons == null) {
            persons = new ArrayList<>();
        }
        return this.persons;
    }

    /**
     * Gets the value of the pagination property.
     * 
     * @return
     *     possible object is
     *     {@link PaginationResultType }
     *     
     */
    public PaginationResultType getPagination() {
        return pagination;
    }

    /**
     * Sets the value of the pagination property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaginationResultType }
     *     
     */
    public void setPagination(PaginationResultType value) {
        this.pagination = value;
    }

}

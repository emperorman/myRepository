
package com.kg.isignatureserver.web.services.keyinfoservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for orginfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="orginfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="orgCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgfakeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parent" type="{http://keyinfoServices.services.web.iSignatureServer.kg.com/}orginfo" minOccurs="0"/>
 *         &lt;element name="seqNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="uniqueMarker" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "orginfo", propOrder = {
    "orgCode",
    "orgName",
    "orgStatus",
    "orgfakeCode",
    "parent",
    "seqNumber",
    "tid",
    "uniqueMarker"
})
public class Orginfo {

    protected String orgCode;
    protected String orgName;
    protected String orgStatus;
    protected String orgfakeCode;
    protected Orginfo parent;
    protected int seqNumber;
    protected int tid;
    protected String uniqueMarker;

    /**
     * Gets the value of the orgCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgCode() {
        return orgCode;
    }

    /**
     * Sets the value of the orgCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgCode(String value) {
        this.orgCode = value;
    }

    /**
     * Gets the value of the orgName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * Sets the value of the orgName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgName(String value) {
        this.orgName = value;
    }

    /**
     * Gets the value of the orgStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgStatus() {
        return orgStatus;
    }

    /**
     * Sets the value of the orgStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgStatus(String value) {
        this.orgStatus = value;
    }

    /**
     * Gets the value of the orgfakeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgfakeCode() {
        return orgfakeCode;
    }

    /**
     * Sets the value of the orgfakeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgfakeCode(String value) {
        this.orgfakeCode = value;
    }

    /**
     * Gets the value of the parent property.
     * 
     * @return
     *     possible object is
     *     {@link Orginfo }
     *     
     */
    public Orginfo getParent() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Orginfo }
     *     
     */
    public void setParent(Orginfo value) {
        this.parent = value;
    }

    /**
     * Gets the value of the seqNumber property.
     * 
     */
    public int getSeqNumber() {
        return seqNumber;
    }

    /**
     * Sets the value of the seqNumber property.
     * 
     */
    public void setSeqNumber(int value) {
        this.seqNumber = value;
    }

    /**
     * Gets the value of the tid property.
     * 
     */
    public int getTid() {
        return tid;
    }

    /**
     * Sets the value of the tid property.
     * 
     */
    public void setTid(int value) {
        this.tid = value;
    }

    /**
     * Gets the value of the uniqueMarker property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueMarker() {
        return uniqueMarker;
    }

    /**
     * Sets the value of the uniqueMarker property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueMarker(String value) {
        this.uniqueMarker = value;
    }

}

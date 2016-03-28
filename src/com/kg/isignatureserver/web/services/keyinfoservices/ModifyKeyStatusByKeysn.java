
package com.kg.isignatureserver.web.services.keyinfoservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for modifyKeyStatusByKeysn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="modifyKeyStatusByKeysn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="keySN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="keystatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modifyKeyStatusByKeysn", propOrder = {
    "keySN",
    "keystatus"
})
public class ModifyKeyStatusByKeysn {

    protected String keySN;
    protected String keystatus;

    /**
     * Gets the value of the keySN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeySN() {
        return keySN;
    }

    /**
     * Sets the value of the keySN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeySN(String value) {
        this.keySN = value;
    }

    /**
     * Gets the value of the keystatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeystatus() {
        return keystatus;
    }

    /**
     * Sets the value of the keystatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeystatus(String value) {
        this.keystatus = value;
    }

}

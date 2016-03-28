
package com.kg.isignatureserver.web.services.signinfoservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getSignInfosByKeySN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getSignInfosByKeySN">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="keySn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSignInfosByKeySN", propOrder = {
    "keySn"
})
public class GetSignInfosByKeySN {

    protected String keySn;

    /**
     * Gets the value of the keySn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeySn() {
        return keySn;
    }

    /**
     * Sets the value of the keySn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeySn(String value) {
        this.keySn = value;
    }

}

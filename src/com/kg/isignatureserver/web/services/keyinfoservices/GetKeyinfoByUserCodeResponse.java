
package com.kg.isignatureserver.web.services.keyinfoservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getKeyinfoByUserCodeResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getKeyinfoByUserCodeResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="keyinfo" type="{http://keyinfoServices.services.web.iSignatureServer.kg.com/}keyinfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getKeyinfoByUserCodeResponse", propOrder = {
    "keyinfo"
})
public class GetKeyinfoByUserCodeResponse {

    protected Keyinfo keyinfo;

    /**
     * Gets the value of the keyinfo property.
     * 
     * @return
     *     possible object is
     *     {@link Keyinfo }
     *     
     */
    public Keyinfo getKeyinfo() {
        return keyinfo;
    }

    /**
     * Sets the value of the keyinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Keyinfo }
     *     
     */
    public void setKeyinfo(Keyinfo value) {
        this.keyinfo = value;
    }

}

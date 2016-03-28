
package com.kg.isignatureserver.web.services.signinfoservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getSigninfoBySignSN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getSigninfoBySignSN">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="signSn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSigninfoBySignSN", propOrder = {
    "signSn"
})
public class GetSigninfoBySignSN {

    protected String signSn;

    /**
     * Gets the value of the signSn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignSn() {
        return signSn;
    }

    /**
     * Sets the value of the signSn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignSn(String value) {
        this.signSn = value;
    }

}

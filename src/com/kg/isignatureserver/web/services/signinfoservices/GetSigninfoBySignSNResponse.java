
package com.kg.isignatureserver.web.services.signinfoservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getSigninfoBySignSNResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getSigninfoBySignSNResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="signInfo" type="{http://signinfoServices.services.web.iSignatureServer.kg.com/}signinfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSigninfoBySignSNResponse", propOrder = {
    "signInfo"
})
public class GetSigninfoBySignSNResponse {

    protected Signinfo signInfo;

    /**
     * Gets the value of the signInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Signinfo }
     *     
     */
    public Signinfo getSignInfo() {
        return signInfo;
    }

    /**
     * Sets the value of the signInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Signinfo }
     *     
     */
    public void setSignInfo(Signinfo value) {
        this.signInfo = value;
    }

}


package com.kg.isignatureserver.web.services.orginfoservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getRootResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getRootResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rootOrg" type="{http://orginfoServices.services.web.iSignatureServer.kg.com/}orginfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRootResponse", propOrder = {
    "rootOrg"
})
public class GetRootResponse {

    protected Orginfo rootOrg;

    /**
     * Gets the value of the rootOrg property.
     * 
     * @return
     *     possible object is
     *     {@link Orginfo }
     *     
     */
    public Orginfo getRootOrg() {
        return rootOrg;
    }

    /**
     * Sets the value of the rootOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Orginfo }
     *     
     */
    public void setRootOrg(Orginfo value) {
        this.rootOrg = value;
    }

}

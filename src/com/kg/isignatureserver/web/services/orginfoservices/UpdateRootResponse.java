
package com.kg.isignatureserver.web.services.orginfoservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateRootResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateRootResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="result" type="{http://orginfoServices.services.web.iSignatureServer.kg.com/}jsonBean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateRootResponse", propOrder = {
    "result"
})
public class UpdateRootResponse {

    protected JsonBean result;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link JsonBean }
     *     
     */
    public JsonBean getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link JsonBean }
     *     
     */
    public void setResult(JsonBean value) {
        this.result = value;
    }

}

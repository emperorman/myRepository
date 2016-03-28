
package com.kg.isignatureserver.web.services.signinfoservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addSignInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addSignInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="image" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="imageExt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="signName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="keySN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="iamgeWidth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imageHeight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addSignInfo", propOrder = {
    "image",
    "imageExt",
    "signName",
    "keySN",
    "iamgeWidth",
    "imageHeight"
})
public class AddSignInfo {

    protected byte[] image;
    protected String imageExt;
    protected String signName;
    protected String keySN;
    protected String iamgeWidth;
    protected String imageHeight;

    /**
     * Gets the value of the image property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getImage() {
        return image;
    }

    /**
     * Sets the value of the image property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setImage(byte[] value) {
        this.image = ((byte[]) value);
    }

    /**
     * Gets the value of the imageExt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageExt() {
        return imageExt;
    }

    /**
     * Sets the value of the imageExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageExt(String value) {
        this.imageExt = value;
    }

    /**
     * Gets the value of the signName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignName() {
        return signName;
    }

    /**
     * Sets the value of the signName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignName(String value) {
        this.signName = value;
    }

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
     * Gets the value of the iamgeWidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIamgeWidth() {
        return iamgeWidth;
    }

    /**
     * Sets the value of the iamgeWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIamgeWidth(String value) {
        this.iamgeWidth = value;
    }

    /**
     * Gets the value of the imageHeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageHeight() {
        return imageHeight;
    }

    /**
     * Sets the value of the imageHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageHeight(String value) {
        this.imageHeight = value;
    }

}

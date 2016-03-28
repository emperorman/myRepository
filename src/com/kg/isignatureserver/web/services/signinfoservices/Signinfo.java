
package com.kg.isignatureserver.web.services.signinfoservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for signinfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="signinfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="checkCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extParam1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extParam2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gaclipdata" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gasignmeta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gawritekey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gdcaEncodeDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="keyinfo" type="{http://signinfoServices.services.web.iSignatureServer.kg.com/}keyinfo" minOccurs="0"/>
 *         &lt;element name="oldcheckcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pfxCertData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pfxFileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pfxPwd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="picMd5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="signCheck" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="signData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="signDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="signDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="signExt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="signHeight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="signIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="signName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="signSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="signSn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="signStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="signType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="signWidth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "signinfo", propOrder = {
    "checkCode",
    "extParam1",
    "extParam2",
    "gaclipdata",
    "gasignmeta",
    "gawritekey",
    "gdcaEncodeDate",
    "keyinfo",
    "oldcheckcode",
    "pfxCertData",
    "pfxFileName",
    "pfxPwd",
    "picMd5",
    "signCheck",
    "signData",
    "signDate",
    "signDescription",
    "signExt",
    "signHeight",
    "signIP",
    "signName",
    "signSize",
    "signSn",
    "signStatus",
    "signType",
    "signWidth",
    "tid"
})
public class Signinfo {

    protected String checkCode;
    protected String extParam1;
    protected String extParam2;
    protected String gaclipdata;
    protected String gasignmeta;
    protected String gawritekey;
    protected String gdcaEncodeDate;
    protected Keyinfo keyinfo;
    protected String oldcheckcode;
    protected String pfxCertData;
    protected String pfxFileName;
    protected String pfxPwd;
    protected String picMd5;
    protected String signCheck;
    protected String signData;
    protected String signDate;
    protected String signDescription;
    protected String signExt;
    protected String signHeight;
    protected String signIP;
    protected String signName;
    protected String signSize;
    protected String signSn;
    protected String signStatus;
    protected String signType;
    protected String signWidth;
    protected int tid;

    /**
     * Gets the value of the checkCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckCode() {
        return checkCode;
    }

    /**
     * Sets the value of the checkCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckCode(String value) {
        this.checkCode = value;
    }

    /**
     * Gets the value of the extParam1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtParam1() {
        return extParam1;
    }

    /**
     * Sets the value of the extParam1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtParam1(String value) {
        this.extParam1 = value;
    }

    /**
     * Gets the value of the extParam2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtParam2() {
        return extParam2;
    }

    /**
     * Sets the value of the extParam2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtParam2(String value) {
        this.extParam2 = value;
    }

    /**
     * Gets the value of the gaclipdata property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGaclipdata() {
        return gaclipdata;
    }

    /**
     * Sets the value of the gaclipdata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGaclipdata(String value) {
        this.gaclipdata = value;
    }

    /**
     * Gets the value of the gasignmeta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGasignmeta() {
        return gasignmeta;
    }

    /**
     * Sets the value of the gasignmeta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGasignmeta(String value) {
        this.gasignmeta = value;
    }

    /**
     * Gets the value of the gawritekey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGawritekey() {
        return gawritekey;
    }

    /**
     * Sets the value of the gawritekey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGawritekey(String value) {
        this.gawritekey = value;
    }

    /**
     * Gets the value of the gdcaEncodeDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGdcaEncodeDate() {
        return gdcaEncodeDate;
    }

    /**
     * Sets the value of the gdcaEncodeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGdcaEncodeDate(String value) {
        this.gdcaEncodeDate = value;
    }

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

    /**
     * Gets the value of the oldcheckcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldcheckcode() {
        return oldcheckcode;
    }

    /**
     * Sets the value of the oldcheckcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldcheckcode(String value) {
        this.oldcheckcode = value;
    }

    /**
     * Gets the value of the pfxCertData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPfxCertData() {
        return pfxCertData;
    }

    /**
     * Sets the value of the pfxCertData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPfxCertData(String value) {
        this.pfxCertData = value;
    }

    /**
     * Gets the value of the pfxFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPfxFileName() {
        return pfxFileName;
    }

    /**
     * Sets the value of the pfxFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPfxFileName(String value) {
        this.pfxFileName = value;
    }

    /**
     * Gets the value of the pfxPwd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPfxPwd() {
        return pfxPwd;
    }

    /**
     * Sets the value of the pfxPwd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPfxPwd(String value) {
        this.pfxPwd = value;
    }

    /**
     * Gets the value of the picMd5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPicMd5() {
        return picMd5;
    }

    /**
     * Sets the value of the picMd5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPicMd5(String value) {
        this.picMd5 = value;
    }

    /**
     * Gets the value of the signCheck property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignCheck() {
        return signCheck;
    }

    /**
     * Sets the value of the signCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignCheck(String value) {
        this.signCheck = value;
    }

    /**
     * Gets the value of the signData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignData() {
        return signData;
    }

    /**
     * Sets the value of the signData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignData(String value) {
        this.signData = value;
    }

    /**
     * Gets the value of the signDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignDate() {
        return signDate;
    }

    /**
     * Sets the value of the signDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignDate(String value) {
        this.signDate = value;
    }

    /**
     * Gets the value of the signDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignDescription() {
        return signDescription;
    }

    /**
     * Sets the value of the signDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignDescription(String value) {
        this.signDescription = value;
    }

    /**
     * Gets the value of the signExt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignExt() {
        return signExt;
    }

    /**
     * Sets the value of the signExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignExt(String value) {
        this.signExt = value;
    }

    /**
     * Gets the value of the signHeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignHeight() {
        return signHeight;
    }

    /**
     * Sets the value of the signHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignHeight(String value) {
        this.signHeight = value;
    }

    /**
     * Gets the value of the signIP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignIP() {
        return signIP;
    }

    /**
     * Sets the value of the signIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignIP(String value) {
        this.signIP = value;
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
     * Gets the value of the signSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignSize() {
        return signSize;
    }

    /**
     * Sets the value of the signSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignSize(String value) {
        this.signSize = value;
    }

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

    /**
     * Gets the value of the signStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignStatus() {
        return signStatus;
    }

    /**
     * Sets the value of the signStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignStatus(String value) {
        this.signStatus = value;
    }

    /**
     * Gets the value of the signType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignType() {
        return signType;
    }

    /**
     * Sets the value of the signType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignType(String value) {
        this.signType = value;
    }

    /**
     * Gets the value of the signWidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignWidth() {
        return signWidth;
    }

    /**
     * Sets the value of the signWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignWidth(String value) {
        this.signWidth = value;
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

}

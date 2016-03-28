
package com.kg.isignatureserver.web.services.signinfoservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for keyinfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="keyinfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applyDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="checkCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ext1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ext2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gdcakeyname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isManager" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isVirtual" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="keySn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="keyStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="keyUniqueMarker" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="logoutDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oldcheckcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orginfo" type="{http://signinfoServices.services.web.iSignatureServer.kg.com/}orginfo" minOccurs="0"/>
 *         &lt;element name="overDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pfxFileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pfxPwd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pfxcertdata" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seqNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="thisno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="userCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "keyinfo", propOrder = {
    "applyDate",
    "checkCode",
    "description",
    "ext1",
    "ext2",
    "gdcakeyname",
    "isManager",
    "isVirtual",
    "keySn",
    "keyStatus",
    "keyUniqueMarker",
    "logoutDate",
    "oldcheckcode",
    "orginfo",
    "overDate",
    "password",
    "pfxFileName",
    "pfxPwd",
    "pfxcertdata",
    "phone",
    "seqNumber",
    "thisno",
    "tid",
    "userCode",
    "userName"
})
public class Keyinfo {

    protected String applyDate;
    protected String checkCode;
    protected String description;
    protected String ext1;
    protected String ext2;
    protected String gdcakeyname;
    protected String isManager;
    protected String isVirtual;
    protected String keySn;
    protected String keyStatus;
    protected String keyUniqueMarker;
    protected String logoutDate;
    protected String oldcheckcode;
    protected Orginfo orginfo;
    protected String overDate;
    protected String password;
    protected String pfxFileName;
    protected String pfxPwd;
    protected String pfxcertdata;
    protected String phone;
    protected int seqNumber;
    protected String thisno;
    protected int tid;
    protected String userCode;
    protected String userName;

    /**
     * Gets the value of the applyDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplyDate() {
        return applyDate;
    }

    /**
     * Sets the value of the applyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplyDate(String value) {
        this.applyDate = value;
    }

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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the ext1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExt1() {
        return ext1;
    }

    /**
     * Sets the value of the ext1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExt1(String value) {
        this.ext1 = value;
    }

    /**
     * Gets the value of the ext2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExt2() {
        return ext2;
    }

    /**
     * Sets the value of the ext2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExt2(String value) {
        this.ext2 = value;
    }

    /**
     * Gets the value of the gdcakeyname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGdcakeyname() {
        return gdcakeyname;
    }

    /**
     * Sets the value of the gdcakeyname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGdcakeyname(String value) {
        this.gdcakeyname = value;
    }

    /**
     * Gets the value of the isManager property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsManager() {
        return isManager;
    }

    /**
     * Sets the value of the isManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsManager(String value) {
        this.isManager = value;
    }

    /**
     * Gets the value of the isVirtual property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsVirtual() {
        return isVirtual;
    }

    /**
     * Sets the value of the isVirtual property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsVirtual(String value) {
        this.isVirtual = value;
    }

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

    /**
     * Gets the value of the keyStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyStatus() {
        return keyStatus;
    }

    /**
     * Sets the value of the keyStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyStatus(String value) {
        this.keyStatus = value;
    }

    /**
     * Gets the value of the keyUniqueMarker property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyUniqueMarker() {
        return keyUniqueMarker;
    }

    /**
     * Sets the value of the keyUniqueMarker property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyUniqueMarker(String value) {
        this.keyUniqueMarker = value;
    }

    /**
     * Gets the value of the logoutDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogoutDate() {
        return logoutDate;
    }

    /**
     * Sets the value of the logoutDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogoutDate(String value) {
        this.logoutDate = value;
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
     * Gets the value of the orginfo property.
     * 
     * @return
     *     possible object is
     *     {@link Orginfo }
     *     
     */
    public Orginfo getOrginfo() {
        return orginfo;
    }

    /**
     * Sets the value of the orginfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Orginfo }
     *     
     */
    public void setOrginfo(Orginfo value) {
        this.orginfo = value;
    }

    /**
     * Gets the value of the overDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverDate() {
        return overDate;
    }

    /**
     * Sets the value of the overDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverDate(String value) {
        this.overDate = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
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
     * Gets the value of the pfxcertdata property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPfxcertdata() {
        return pfxcertdata;
    }

    /**
     * Sets the value of the pfxcertdata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPfxcertdata(String value) {
        this.pfxcertdata = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
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
     * Gets the value of the thisno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThisno() {
        return thisno;
    }

    /**
     * Sets the value of the thisno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThisno(String value) {
        this.thisno = value;
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
     * Gets the value of the userCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserCode() {
        return userCode;
    }

    /**
     * Sets the value of the userCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserCode(String value) {
        this.userCode = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

}

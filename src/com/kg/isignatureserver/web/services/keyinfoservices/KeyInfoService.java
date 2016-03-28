package com.kg.isignatureserver.web.services.keyinfoservices;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.4.0
 * 2016-03-04T11:26:45.820+08:00
 * Generated source version: 2.4.0
 * 
 */
 
@WebService(targetNamespace = "http://keyinfoServices.services.web.iSignatureServer.kg.com/", name = "KeyInfoService")
@XmlSeeAlso({ObjectFactory.class})
public interface KeyInfoService {

    @WebResult(name = "isOk", targetNamespace = "")
    @RequestWrapper(localName = "modifyPwdByUserCode", targetNamespace = "http://keyinfoServices.services.web.iSignatureServer.kg.com/", className = "com.kg.isignatureserver.web.services.keyinfoservices.ModifyPwdByUserCode")
    @WebMethod
    @ResponseWrapper(localName = "modifyPwdByUserCodeResponse", targetNamespace = "http://keyinfoServices.services.web.iSignatureServer.kg.com/", className = "com.kg.isignatureserver.web.services.keyinfoservices.ModifyPwdByUserCodeResponse")
    public boolean modifyPwdByUserCode(
        @WebParam(name = "userCode", targetNamespace = "")
        java.lang.String userCode,
        @WebParam(name = "newPwd", targetNamespace = "")
        java.lang.String newPwd
    );

    @WebResult(name = "isOk", targetNamespace = "")
    @RequestWrapper(localName = "modifyPwdByKeySn", targetNamespace = "http://keyinfoServices.services.web.iSignatureServer.kg.com/", className = "com.kg.isignatureserver.web.services.keyinfoservices.ModifyPwdByKeySn")
    @WebMethod
    @ResponseWrapper(localName = "modifyPwdByKeySnResponse", targetNamespace = "http://keyinfoServices.services.web.iSignatureServer.kg.com/", className = "com.kg.isignatureserver.web.services.keyinfoservices.ModifyPwdByKeySnResponse")
    public boolean modifyPwdByKeySn(
        @WebParam(name = "keysn", targetNamespace = "")
        java.lang.String keysn,
        @WebParam(name = "newPwd", targetNamespace = "")
        java.lang.String newPwd
    );

    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "addKeyinfo", targetNamespace = "http://keyinfoServices.services.web.iSignatureServer.kg.com/", className = "com.kg.isignatureserver.web.services.keyinfoservices.AddKeyinfo")
    @WebMethod
    @ResponseWrapper(localName = "addKeyinfoResponse", targetNamespace = "http://keyinfoServices.services.web.iSignatureServer.kg.com/", className = "com.kg.isignatureserver.web.services.keyinfoservices.AddKeyinfoResponse")
    public com.kg.isignatureserver.web.services.keyinfoservices.JsonBean addKeyinfo(
        @WebParam(name = "keyinfo", targetNamespace = "")
        com.kg.isignatureserver.web.services.keyinfoservices.Keyinfo keyinfo
    );

    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "modifyKeyStatusByKeysn", targetNamespace = "http://keyinfoServices.services.web.iSignatureServer.kg.com/", className = "com.kg.isignatureserver.web.services.keyinfoservices.ModifyKeyStatusByKeysn")
    @WebMethod
    @ResponseWrapper(localName = "modifyKeyStatusByKeysnResponse", targetNamespace = "http://keyinfoServices.services.web.iSignatureServer.kg.com/", className = "com.kg.isignatureserver.web.services.keyinfoservices.ModifyKeyStatusByKeysnResponse")
    public boolean modifyKeyStatusByKeysn(
        @WebParam(name = "keySN", targetNamespace = "")
        java.lang.String keySN,
        @WebParam(name = "keystatus", targetNamespace = "")
        java.lang.String keystatus
    );

    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "addKey", targetNamespace = "http://keyinfoServices.services.web.iSignatureServer.kg.com/", className = "com.kg.isignatureserver.web.services.keyinfoservices.AddKey")
    @WebMethod
    @ResponseWrapper(localName = "addKeyResponse", targetNamespace = "http://keyinfoServices.services.web.iSignatureServer.kg.com/", className = "com.kg.isignatureserver.web.services.keyinfoservices.AddKeyResponse")
    public com.kg.isignatureserver.web.services.keyinfoservices.JsonBean addKey(
        @WebParam(name = "keySn", targetNamespace = "")
        java.lang.String keySn,
        @WebParam(name = "userCode", targetNamespace = "")
        java.lang.String userCode,
        @WebParam(name = "userName", targetNamespace = "")
        java.lang.String userName,
        @WebParam(name = "overDate", targetNamespace = "")
        java.lang.String overDate,
        @WebParam(name = "password", targetNamespace = "")
        java.lang.String password
    );

    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "modifyKeyinfo", targetNamespace = "http://keyinfoServices.services.web.iSignatureServer.kg.com/", className = "com.kg.isignatureserver.web.services.keyinfoservices.ModifyKeyinfo")
    @WebMethod
    @ResponseWrapper(localName = "modifyKeyinfoResponse", targetNamespace = "http://keyinfoServices.services.web.iSignatureServer.kg.com/", className = "com.kg.isignatureserver.web.services.keyinfoservices.ModifyKeyinfoResponse")
    public com.kg.isignatureserver.web.services.keyinfoservices.JsonBean modifyKeyinfo(
        @WebParam(name = "keyinfo", targetNamespace = "")
        com.kg.isignatureserver.web.services.keyinfoservices.Keyinfo keyinfo
    );

    @WebResult(name = "keyinfo", targetNamespace = "")
    @RequestWrapper(localName = "getKeyinfoByKeySN", targetNamespace = "http://keyinfoServices.services.web.iSignatureServer.kg.com/", className = "com.kg.isignatureserver.web.services.keyinfoservices.GetKeyinfoByKeySN")
    @WebMethod
    @ResponseWrapper(localName = "getKeyinfoByKeySNResponse", targetNamespace = "http://keyinfoServices.services.web.iSignatureServer.kg.com/", className = "com.kg.isignatureserver.web.services.keyinfoservices.GetKeyinfoByKeySNResponse")
    public com.kg.isignatureserver.web.services.keyinfoservices.Keyinfo getKeyinfoByKeySN(
        @WebParam(name = "keySN", targetNamespace = "")
        java.lang.String keySN
    );

    @WebResult(name = "keyinfo", targetNamespace = "")
    @RequestWrapper(localName = "getKeyinfoByUserCode", targetNamespace = "http://keyinfoServices.services.web.iSignatureServer.kg.com/", className = "com.kg.isignatureserver.web.services.keyinfoservices.GetKeyinfoByUserCode")
    @WebMethod
    @ResponseWrapper(localName = "getKeyinfoByUserCodeResponse", targetNamespace = "http://keyinfoServices.services.web.iSignatureServer.kg.com/", className = "com.kg.isignatureserver.web.services.keyinfoservices.GetKeyinfoByUserCodeResponse")
    public com.kg.isignatureserver.web.services.keyinfoservices.Keyinfo getKeyinfoByUserCode(
        @WebParam(name = "userCode", targetNamespace = "")
        java.lang.String userCode
    );
}

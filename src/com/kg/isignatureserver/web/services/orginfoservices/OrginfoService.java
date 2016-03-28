package com.kg.isignatureserver.web.services.orginfoservices;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.4.0
 * 2016-03-11T16:28:16.148+08:00
 * Generated source version: 2.4.0
 * 
 */
 
@WebService(targetNamespace = "http://orginfoServices.services.web.iSignatureServer.kg.com/", name = "OrginfoService")
@XmlSeeAlso({ObjectFactory.class})
public interface OrginfoService {

    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "updateRoot", targetNamespace = "http://orginfoServices.services.web.iSignatureServer.kg.com/", className = "com.kg.isignatureserver.web.services.orginfoservices.UpdateRoot")
    @WebMethod
    @ResponseWrapper(localName = "updateRootResponse", targetNamespace = "http://orginfoServices.services.web.iSignatureServer.kg.com/", className = "com.kg.isignatureserver.web.services.orginfoservices.UpdateRootResponse")
    public com.kg.isignatureserver.web.services.orginfoservices.JsonBean updateRoot(
        @WebParam(name = "orgName", targetNamespace = "")
        java.lang.String orgName
    );

    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "updateOrginfo", targetNamespace = "http://orginfoServices.services.web.iSignatureServer.kg.com/", className = "com.kg.isignatureserver.web.services.orginfoservices.UpdateOrginfo")
    @WebMethod
    @ResponseWrapper(localName = "updateOrginfoResponse", targetNamespace = "http://orginfoServices.services.web.iSignatureServer.kg.com/", className = "com.kg.isignatureserver.web.services.orginfoservices.UpdateOrginfoResponse")
    public com.kg.isignatureserver.web.services.orginfoservices.JsonBean updateOrginfo(
        @WebParam(name = "uniqueMarker", targetNamespace = "")
        java.lang.String uniqueMarker,
        @WebParam(name = "orgName", targetNamespace = "")
        java.lang.String orgName,
        @WebParam(name = "orgStatus", targetNamespace = "")
        java.lang.String orgStatus
    );

    @WebResult(name = "rootOrg", targetNamespace = "")
    @RequestWrapper(localName = "getRoot", targetNamespace = "http://orginfoServices.services.web.iSignatureServer.kg.com/", className = "com.kg.isignatureserver.web.services.orginfoservices.GetRoot")
    @WebMethod
    @ResponseWrapper(localName = "getRootResponse", targetNamespace = "http://orginfoServices.services.web.iSignatureServer.kg.com/", className = "com.kg.isignatureserver.web.services.orginfoservices.GetRootResponse")
    public com.kg.isignatureserver.web.services.orginfoservices.Orginfo getRoot();

    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "addOrginfo", targetNamespace = "http://orginfoServices.services.web.iSignatureServer.kg.com/", className = "com.kg.isignatureserver.web.services.orginfoservices.AddOrginfo")
    @WebMethod
    @ResponseWrapper(localName = "addOrginfoResponse", targetNamespace = "http://orginfoServices.services.web.iSignatureServer.kg.com/", className = "com.kg.isignatureserver.web.services.orginfoservices.AddOrginfoResponse")
    public com.kg.isignatureserver.web.services.orginfoservices.JsonBean addOrginfo(
        @WebParam(name = "uniqueMarker", targetNamespace = "")
        java.lang.String uniqueMarker,
        @WebParam(name = "parentUnique", targetNamespace = "")
        java.lang.String parentUnique,
        @WebParam(name = "orgName", targetNamespace = "")
        java.lang.String orgName
    );
}

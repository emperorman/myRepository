
package com.kg.isignatureserver.web.services.signinfoservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.kg.isignatureserver.web.services.signinfoservices package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetSigninfosByUserCode_QNAME = new QName("http://signinfoServices.services.web.iSignatureServer.kg.com/", "getSigninfosByUserCode");
    private final static QName _AddSignInfo_QNAME = new QName("http://signinfoServices.services.web.iSignatureServer.kg.com/", "addSignInfo");
    private final static QName _AddSignInfoResponse_QNAME = new QName("http://signinfoServices.services.web.iSignatureServer.kg.com/", "addSignInfoResponse");
    private final static QName _GetSigninfosByUserCodeResponse_QNAME = new QName("http://signinfoServices.services.web.iSignatureServer.kg.com/", "getSigninfosByUserCodeResponse");
    private final static QName _GetSignInfosByKeySN_QNAME = new QName("http://signinfoServices.services.web.iSignatureServer.kg.com/", "getSignInfosByKeySN");
    private final static QName _GetSigninfoBySignSNResponse_QNAME = new QName("http://signinfoServices.services.web.iSignatureServer.kg.com/", "getSigninfoBySignSNResponse");
    private final static QName _GetSignInfosByKeySNResponse_QNAME = new QName("http://signinfoServices.services.web.iSignatureServer.kg.com/", "getSignInfosByKeySNResponse");
    private final static QName _GetSigninfoBySignSN_QNAME = new QName("http://signinfoServices.services.web.iSignatureServer.kg.com/", "getSigninfoBySignSN");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.kg.isignatureserver.web.services.signinfoservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetSignInfosByKeySNResponse }
     * 
     */
    public GetSignInfosByKeySNResponse createGetSignInfosByKeySNResponse() {
        return new GetSignInfosByKeySNResponse();
    }

    /**
     * Create an instance of {@link GetSigninfoBySignSNResponse }
     * 
     */
    public GetSigninfoBySignSNResponse createGetSigninfoBySignSNResponse() {
        return new GetSigninfoBySignSNResponse();
    }

    /**
     * Create an instance of {@link GetSigninfoBySignSN }
     * 
     */
    public GetSigninfoBySignSN createGetSigninfoBySignSN() {
        return new GetSigninfoBySignSN();
    }

    /**
     * Create an instance of {@link AddSignInfoResponse }
     * 
     */
    public AddSignInfoResponse createAddSignInfoResponse() {
        return new AddSignInfoResponse();
    }

    /**
     * Create an instance of {@link AddSignInfo }
     * 
     */
    public AddSignInfo createAddSignInfo() {
        return new AddSignInfo();
    }

    /**
     * Create an instance of {@link GetSigninfosByUserCode }
     * 
     */
    public GetSigninfosByUserCode createGetSigninfosByUserCode() {
        return new GetSigninfosByUserCode();
    }

    /**
     * Create an instance of {@link GetSignInfosByKeySN }
     * 
     */
    public GetSignInfosByKeySN createGetSignInfosByKeySN() {
        return new GetSignInfosByKeySN();
    }

    /**
     * Create an instance of {@link GetSigninfosByUserCodeResponse }
     * 
     */
    public GetSigninfosByUserCodeResponse createGetSigninfosByUserCodeResponse() {
        return new GetSigninfosByUserCodeResponse();
    }

    /**
     * Create an instance of {@link Signinfo }
     * 
     */
    public Signinfo createSigninfo() {
        return new Signinfo();
    }

    /**
     * Create an instance of {@link Orginfo }
     * 
     */
    public Orginfo createOrginfo() {
        return new Orginfo();
    }

    /**
     * Create an instance of {@link Keyinfo }
     * 
     */
    public Keyinfo createKeyinfo() {
        return new Keyinfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSigninfosByUserCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://signinfoServices.services.web.iSignatureServer.kg.com/", name = "getSigninfosByUserCode")
    public JAXBElement<GetSigninfosByUserCode> createGetSigninfosByUserCode(GetSigninfosByUserCode value) {
        return new JAXBElement<GetSigninfosByUserCode>(_GetSigninfosByUserCode_QNAME, GetSigninfosByUserCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddSignInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://signinfoServices.services.web.iSignatureServer.kg.com/", name = "addSignInfo")
    public JAXBElement<AddSignInfo> createAddSignInfo(AddSignInfo value) {
        return new JAXBElement<AddSignInfo>(_AddSignInfo_QNAME, AddSignInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddSignInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://signinfoServices.services.web.iSignatureServer.kg.com/", name = "addSignInfoResponse")
    public JAXBElement<AddSignInfoResponse> createAddSignInfoResponse(AddSignInfoResponse value) {
        return new JAXBElement<AddSignInfoResponse>(_AddSignInfoResponse_QNAME, AddSignInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSigninfosByUserCodeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://signinfoServices.services.web.iSignatureServer.kg.com/", name = "getSigninfosByUserCodeResponse")
    public JAXBElement<GetSigninfosByUserCodeResponse> createGetSigninfosByUserCodeResponse(GetSigninfosByUserCodeResponse value) {
        return new JAXBElement<GetSigninfosByUserCodeResponse>(_GetSigninfosByUserCodeResponse_QNAME, GetSigninfosByUserCodeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSignInfosByKeySN }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://signinfoServices.services.web.iSignatureServer.kg.com/", name = "getSignInfosByKeySN")
    public JAXBElement<GetSignInfosByKeySN> createGetSignInfosByKeySN(GetSignInfosByKeySN value) {
        return new JAXBElement<GetSignInfosByKeySN>(_GetSignInfosByKeySN_QNAME, GetSignInfosByKeySN.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSigninfoBySignSNResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://signinfoServices.services.web.iSignatureServer.kg.com/", name = "getSigninfoBySignSNResponse")
    public JAXBElement<GetSigninfoBySignSNResponse> createGetSigninfoBySignSNResponse(GetSigninfoBySignSNResponse value) {
        return new JAXBElement<GetSigninfoBySignSNResponse>(_GetSigninfoBySignSNResponse_QNAME, GetSigninfoBySignSNResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSignInfosByKeySNResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://signinfoServices.services.web.iSignatureServer.kg.com/", name = "getSignInfosByKeySNResponse")
    public JAXBElement<GetSignInfosByKeySNResponse> createGetSignInfosByKeySNResponse(GetSignInfosByKeySNResponse value) {
        return new JAXBElement<GetSignInfosByKeySNResponse>(_GetSignInfosByKeySNResponse_QNAME, GetSignInfosByKeySNResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSigninfoBySignSN }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://signinfoServices.services.web.iSignatureServer.kg.com/", name = "getSigninfoBySignSN")
    public JAXBElement<GetSigninfoBySignSN> createGetSigninfoBySignSN(GetSigninfoBySignSN value) {
        return new JAXBElement<GetSigninfoBySignSN>(_GetSigninfoBySignSN_QNAME, GetSigninfoBySignSN.class, null, value);
    }

}

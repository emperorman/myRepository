
package com.kg.isignatureserver.web.services.orginfoservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.kg.isignatureserver.web.services.orginfoservices package. 
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

    private final static QName _AddOrginfoResponse_QNAME = new QName("http://orginfoServices.services.web.iSignatureServer.kg.com/", "addOrginfoResponse");
    private final static QName _GetRootResponse_QNAME = new QName("http://orginfoServices.services.web.iSignatureServer.kg.com/", "getRootResponse");
    private final static QName _GetRoot_QNAME = new QName("http://orginfoServices.services.web.iSignatureServer.kg.com/", "getRoot");
    private final static QName _UpdateOrginfo_QNAME = new QName("http://orginfoServices.services.web.iSignatureServer.kg.com/", "updateOrginfo");
    private final static QName _UpdateRootResponse_QNAME = new QName("http://orginfoServices.services.web.iSignatureServer.kg.com/", "updateRootResponse");
    private final static QName _UpdateOrginfoResponse_QNAME = new QName("http://orginfoServices.services.web.iSignatureServer.kg.com/", "updateOrginfoResponse");
    private final static QName _AddOrginfo_QNAME = new QName("http://orginfoServices.services.web.iSignatureServer.kg.com/", "addOrginfo");
    private final static QName _UpdateRoot_QNAME = new QName("http://orginfoServices.services.web.iSignatureServer.kg.com/", "updateRoot");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.kg.isignatureserver.web.services.orginfoservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UpdateRoot }
     * 
     */
    public UpdateRoot createUpdateRoot() {
        return new UpdateRoot();
    }

    /**
     * Create an instance of {@link UpdateOrginfoResponse }
     * 
     */
    public UpdateOrginfoResponse createUpdateOrginfoResponse() {
        return new UpdateOrginfoResponse();
    }

    /**
     * Create an instance of {@link AddOrginfo }
     * 
     */
    public AddOrginfo createAddOrginfo() {
        return new AddOrginfo();
    }

    /**
     * Create an instance of {@link GetRoot }
     * 
     */
    public GetRoot createGetRoot() {
        return new GetRoot();
    }

    /**
     * Create an instance of {@link UpdateRootResponse }
     * 
     */
    public UpdateRootResponse createUpdateRootResponse() {
        return new UpdateRootResponse();
    }

    /**
     * Create an instance of {@link UpdateOrginfo }
     * 
     */
    public UpdateOrginfo createUpdateOrginfo() {
        return new UpdateOrginfo();
    }

    /**
     * Create an instance of {@link GetRootResponse }
     * 
     */
    public GetRootResponse createGetRootResponse() {
        return new GetRootResponse();
    }

    /**
     * Create an instance of {@link AddOrginfoResponse }
     * 
     */
    public AddOrginfoResponse createAddOrginfoResponse() {
        return new AddOrginfoResponse();
    }

    /**
     * Create an instance of {@link JsonBean }
     * 
     */
    public JsonBean createJsonBean() {
        return new JsonBean();
    }

    /**
     * Create an instance of {@link Orginfo }
     * 
     */
    public Orginfo createOrginfo() {
        return new Orginfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddOrginfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://orginfoServices.services.web.iSignatureServer.kg.com/", name = "addOrginfoResponse")
    public JAXBElement<AddOrginfoResponse> createAddOrginfoResponse(AddOrginfoResponse value) {
        return new JAXBElement<AddOrginfoResponse>(_AddOrginfoResponse_QNAME, AddOrginfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRootResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://orginfoServices.services.web.iSignatureServer.kg.com/", name = "getRootResponse")
    public JAXBElement<GetRootResponse> createGetRootResponse(GetRootResponse value) {
        return new JAXBElement<GetRootResponse>(_GetRootResponse_QNAME, GetRootResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRoot }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://orginfoServices.services.web.iSignatureServer.kg.com/", name = "getRoot")
    public JAXBElement<GetRoot> createGetRoot(GetRoot value) {
        return new JAXBElement<GetRoot>(_GetRoot_QNAME, GetRoot.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateOrginfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://orginfoServices.services.web.iSignatureServer.kg.com/", name = "updateOrginfo")
    public JAXBElement<UpdateOrginfo> createUpdateOrginfo(UpdateOrginfo value) {
        return new JAXBElement<UpdateOrginfo>(_UpdateOrginfo_QNAME, UpdateOrginfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateRootResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://orginfoServices.services.web.iSignatureServer.kg.com/", name = "updateRootResponse")
    public JAXBElement<UpdateRootResponse> createUpdateRootResponse(UpdateRootResponse value) {
        return new JAXBElement<UpdateRootResponse>(_UpdateRootResponse_QNAME, UpdateRootResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateOrginfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://orginfoServices.services.web.iSignatureServer.kg.com/", name = "updateOrginfoResponse")
    public JAXBElement<UpdateOrginfoResponse> createUpdateOrginfoResponse(UpdateOrginfoResponse value) {
        return new JAXBElement<UpdateOrginfoResponse>(_UpdateOrginfoResponse_QNAME, UpdateOrginfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddOrginfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://orginfoServices.services.web.iSignatureServer.kg.com/", name = "addOrginfo")
    public JAXBElement<AddOrginfo> createAddOrginfo(AddOrginfo value) {
        return new JAXBElement<AddOrginfo>(_AddOrginfo_QNAME, AddOrginfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateRoot }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://orginfoServices.services.web.iSignatureServer.kg.com/", name = "updateRoot")
    public JAXBElement<UpdateRoot> createUpdateRoot(UpdateRoot value) {
        return new JAXBElement<UpdateRoot>(_UpdateRoot_QNAME, UpdateRoot.class, null, value);
    }

}


/*
 * 
 */

package com.kg.isignatureserver.web.services.signinfoservices;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.4.0
 * 2016-03-04T12:46:39.933+08:00
 * Generated source version: 2.4.0
 * 
 */


@WebServiceClient(name = "SignInfoServiceService", 
                  wsdlLocation = "http://127.0.0.1:8080/iSignatureServer/services/SignInfoService?wsdl",
                  targetNamespace = "http://signinfoServices.services.web.iSignatureServer.kg.com/") 
public class SignInfoServiceService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://signinfoServices.services.web.iSignatureServer.kg.com/", "SignInfoServiceService");
    public final static QName SignInfoServicePort = new QName("http://signinfoServices.services.web.iSignatureServer.kg.com/", "SignInfoServicePort");
    static {
        URL url = null;
        try {
            url = new URL("http://127.0.0.1:8080/iSignatureServer/services/SignInfoService?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(SignInfoServiceService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://127.0.0.1:8080/iSignatureServer/services/SignInfoService?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public SignInfoServiceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SignInfoServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SignInfoServiceService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public SignInfoServiceService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public SignInfoServiceService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public SignInfoServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SignInfoService
     */
    @WebEndpoint(name = "SignInfoServicePort")
    public SignInfoService getSignInfoServicePort() {
        return super.getPort(SignInfoServicePort, SignInfoService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SignInfoService
     */
    @WebEndpoint(name = "SignInfoServicePort")
    public SignInfoService getSignInfoServicePort(WebServiceFeature... features) {
        return super.getPort(SignInfoServicePort, SignInfoService.class, features);
    }

}
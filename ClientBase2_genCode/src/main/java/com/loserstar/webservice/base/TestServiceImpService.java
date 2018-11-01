
package com.loserstar.webservice.base;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "TestServiceImpService", targetNamespace = "http://base.webservice.loserstar.com/", wsdlLocation = "http://localhost:8888/loser?wsdl")
public class TestServiceImpService
    extends Service
{

    private final static URL TESTSERVICEIMPSERVICE_WSDL_LOCATION;
    private final static WebServiceException TESTSERVICEIMPSERVICE_EXCEPTION;
    private final static QName TESTSERVICEIMPSERVICE_QNAME = new QName("http://base.webservice.loserstar.com/", "TestServiceImpService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8888/loser?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        TESTSERVICEIMPSERVICE_WSDL_LOCATION = url;
        TESTSERVICEIMPSERVICE_EXCEPTION = e;
    }

    public TestServiceImpService() {
        super(__getWsdlLocation(), TESTSERVICEIMPSERVICE_QNAME);
    }

    public TestServiceImpService(WebServiceFeature... features) {
        super(__getWsdlLocation(), TESTSERVICEIMPSERVICE_QNAME, features);
    }

    public TestServiceImpService(URL wsdlLocation) {
        super(wsdlLocation, TESTSERVICEIMPSERVICE_QNAME);
    }

    public TestServiceImpService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, TESTSERVICEIMPSERVICE_QNAME, features);
    }

    public TestServiceImpService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TestServiceImpService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns TestService
     */
    @WebEndpoint(name = "TestServiceImpPort")
    public TestService getTestServiceImpPort() {
        return super.getPort(new QName("http://base.webservice.loserstar.com/", "TestServiceImpPort"), TestService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TestService
     */
    @WebEndpoint(name = "TestServiceImpPort")
    public TestService getTestServiceImpPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://base.webservice.loserstar.com/", "TestServiceImpPort"), TestService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TESTSERVICEIMPSERVICE_EXCEPTION!= null) {
            throw TESTSERVICEIMPSERVICE_EXCEPTION;
        }
        return TESTSERVICEIMPSERVICE_WSDL_LOCATION;
    }

}

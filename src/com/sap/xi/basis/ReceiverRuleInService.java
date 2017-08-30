
package com.sap.xi.basis;

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
@WebServiceClient(name = "ReceiverRuleInService", targetNamespace = "http://sap.com/xi/BASIS", wsdlLocation = "file:/C:/Users/i321257/Documents/PIDocTool/src/ReceiverRuleInImplBean.wsdl")
public class ReceiverRuleInService
    extends Service
{

    private final static URL RECEIVERRULEINSERVICE_WSDL_LOCATION;
    private final static WebServiceException RECEIVERRULEINSERVICE_EXCEPTION;
    private final static QName RECEIVERRULEINSERVICE_QNAME = new QName("http://sap.com/xi/BASIS", "ReceiverRuleInService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Users/i321257/Documents/PIDocTool/src/ReceiverRuleInImplBean.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        RECEIVERRULEINSERVICE_WSDL_LOCATION = url;
        RECEIVERRULEINSERVICE_EXCEPTION = e;
    }

    public ReceiverRuleInService() {
        super(__getWsdlLocation(), RECEIVERRULEINSERVICE_QNAME);
    }

    public ReceiverRuleInService(WebServiceFeature... features) {
        super(__getWsdlLocation(), RECEIVERRULEINSERVICE_QNAME, features);
    }

    public ReceiverRuleInService(URL wsdlLocation) {
        super(wsdlLocation, RECEIVERRULEINSERVICE_QNAME);
    }

    public ReceiverRuleInService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, RECEIVERRULEINSERVICE_QNAME, features);
    }

    public ReceiverRuleInService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ReceiverRuleInService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ReceiverRuleIn
     */
    @WebEndpoint(name = "ReceiverRuleInPort")
    public ReceiverRuleIn getReceiverRuleInPort() {
        return super.getPort(new QName("http://sap.com/xi/BASIS", "ReceiverRuleInPort"), ReceiverRuleIn.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ReceiverRuleIn
     */
    @WebEndpoint(name = "ReceiverRuleInPort")
    public ReceiverRuleIn getReceiverRuleInPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://sap.com/xi/BASIS", "ReceiverRuleInPort"), ReceiverRuleIn.class, features);
    }

    private static URL __getWsdlLocation() {
        if (RECEIVERRULEINSERVICE_EXCEPTION!= null) {
            throw RECEIVERRULEINSERVICE_EXCEPTION;
        }
        return RECEIVERRULEINSERVICE_WSDL_LOCATION;
    }

}

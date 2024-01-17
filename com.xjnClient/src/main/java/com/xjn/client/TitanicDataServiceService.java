package com.xjn.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2024-01-14T15:55:42.517+08:00
 * Generated source version: 2.7.18
 * 
 */
@WebServiceClient(name = "TitanicDataServiceService", 
                  wsdlLocation = "file:/C:/Users/11422/Desktop/miniproject/com.xjnClient/webapp/wsdl/titanicdataservice.wsdl",
                  targetNamespace = "http://xjn.com/") 
public class TitanicDataServiceService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://xjn.com/", "TitanicDataServiceService");
    public final static QName TitanicDataServicePort = new QName("http://xjn.com/", "TitanicDataServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/11422/Desktop/miniproject/com.xjnClient/webapp/wsdl/titanicdataservice.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(TitanicDataServiceService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/D:/projects/xjn/miniproject/com.xjnClient/webapp/wsdl/titanicdataservice.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public TitanicDataServiceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public TitanicDataServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TitanicDataServiceService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public TitanicDataServiceService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public TitanicDataServiceService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public TitanicDataServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns TitanicDataService
     */
    @WebEndpoint(name = "TitanicDataServicePort")
    public TitanicDataService getTitanicDataServicePort() {
        return super.getPort(TitanicDataServicePort, TitanicDataService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TitanicDataService
     */
    @WebEndpoint(name = "TitanicDataServicePort")
    public TitanicDataService getTitanicDataServicePort(WebServiceFeature... features) {
        return super.getPort(TitanicDataServicePort, TitanicDataService.class, features);
    }

}
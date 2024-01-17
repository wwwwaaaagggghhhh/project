
package com.xjn.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.xjn package. 
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

    private final static QName _GetPassengerAttributes_QNAME = new QName("http://xjn.com/", "getPassengerAttributes");
    private final static QName _GetCountByAttributeResponse_QNAME = new QName("http://xjn.com/", "getCountByAttributeResponse");
    private final static QName _GetCountByAttribute_QNAME = new QName("http://xjn.com/", "getCountByAttribute");
    private final static QName _GetPassengerAttributesResponse_QNAME = new QName("http://xjn.com/", "getPassengerAttributesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.xjn
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCountByAttributeResponse }
     * 
     */
    public GetCountByAttributeResponse createGetCountByAttributeResponse() {
        return new GetCountByAttributeResponse();
    }

    /**
     * Create an instance of {@link GetPassengerAttributes }
     * 
     */
    public GetPassengerAttributes createGetPassengerAttributes() {
        return new GetPassengerAttributes();
    }

    /**
     * Create an instance of {@link GetPassengerAttributesResponse }
     * 
     */
    public GetPassengerAttributesResponse createGetPassengerAttributesResponse() {
        return new GetPassengerAttributesResponse();
    }

    /**
     * Create an instance of {@link GetCountByAttribute }
     * 
     */
    public GetCountByAttribute createGetCountByAttribute() {
        return new GetCountByAttribute();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPassengerAttributes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xjn.com/", name = "getPassengerAttributes")
    public JAXBElement<GetPassengerAttributes> createGetPassengerAttributes(GetPassengerAttributes value) {
        return new JAXBElement<GetPassengerAttributes>(_GetPassengerAttributes_QNAME, GetPassengerAttributes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCountByAttributeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xjn.com/", name = "getCountByAttributeResponse")
    public JAXBElement<GetCountByAttributeResponse> createGetCountByAttributeResponse(GetCountByAttributeResponse value) {
        return new JAXBElement<GetCountByAttributeResponse>(_GetCountByAttributeResponse_QNAME, GetCountByAttributeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCountByAttribute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xjn.com/", name = "getCountByAttribute")
    public JAXBElement<GetCountByAttribute> createGetCountByAttribute(GetCountByAttribute value) {
        return new JAXBElement<GetCountByAttribute>(_GetCountByAttribute_QNAME, GetCountByAttribute.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPassengerAttributesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xjn.com/", name = "getPassengerAttributesResponse")
    public JAXBElement<GetPassengerAttributesResponse> createGetPassengerAttributesResponse(GetPassengerAttributesResponse value) {
        return new JAXBElement<GetPassengerAttributesResponse>(_GetPassengerAttributesResponse_QNAME, GetPassengerAttributesResponse.class, null, value);
    }

}

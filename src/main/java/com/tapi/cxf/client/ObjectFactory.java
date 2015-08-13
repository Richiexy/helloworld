
package com.tapi.cxf.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tapi.cxf.client package. 
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

    private final static QName _SayXmlResponse_QNAME = new QName("http://facade.server.cxf.tapi.com/", "sayXmlResponse");
    private final static QName _SayJson_QNAME = new QName("http://facade.server.cxf.tapi.com/", "sayJson");
    private final static QName _SayJsonResponse_QNAME = new QName("http://facade.server.cxf.tapi.com/", "sayJsonResponse");
    private final static QName _SayXml_QNAME = new QName("http://facade.server.cxf.tapi.com/", "sayXml");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tapi.cxf.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SayJson }
     * 
     */
    public SayJson createSayJson() {
        return new SayJson();
    }

    /**
     * Create an instance of {@link SayXmlResponse }
     * 
     */
    public SayXmlResponse createSayXmlResponse() {
        return new SayXmlResponse();
    }

    /**
     * Create an instance of {@link SayXml }
     * 
     */
    public SayXml createSayXml() {
        return new SayXml();
    }

    /**
     * Create an instance of {@link SayJsonResponse }
     * 
     */
    public SayJsonResponse createSayJsonResponse() {
        return new SayJsonResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayXmlResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facade.server.cxf.tapi.com/", name = "sayXmlResponse")
    public JAXBElement<SayXmlResponse> createSayXmlResponse(SayXmlResponse value) {
        return new JAXBElement<SayXmlResponse>(_SayXmlResponse_QNAME, SayXmlResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayJson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facade.server.cxf.tapi.com/", name = "sayJson")
    public JAXBElement<SayJson> createSayJson(SayJson value) {
        return new JAXBElement<SayJson>(_SayJson_QNAME, SayJson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayJsonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facade.server.cxf.tapi.com/", name = "sayJsonResponse")
    public JAXBElement<SayJsonResponse> createSayJsonResponse(SayJsonResponse value) {
        return new JAXBElement<SayJsonResponse>(_SayJsonResponse_QNAME, SayJsonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facade.server.cxf.tapi.com/", name = "sayXml")
    public JAXBElement<SayXml> createSayXml(SayXml value) {
        return new JAXBElement<SayXml>(_SayXml_QNAME, SayXml.class, null, value);
    }

}

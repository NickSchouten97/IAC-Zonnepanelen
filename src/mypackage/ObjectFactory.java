
package mypackage;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mypackage package.
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

    private final static QName _Zonnepanelenrequest_QNAME = new QName("http://schemas.hu.fnt.nl/berichten/request", "Zonnepanelenrequest");
    private final static QName _Zonnepanelenresponse_QNAME = new QName("http://schemas.hu.fnt.nl/berichten/response", "Zonnepanelenresponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mypackage
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Request }
     * 
     */
    public Request createRequest() {
        return new Request();
    }

    /**
     * Create an instance of {@link Response }
     * 
     */
    public Response createResponse() {
        return new Response();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Request }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.hu.fnt.nl/berichten/request", name = "Zonnepanelenrequest")
    public JAXBElement<Request> createZonnepanelenrequest(Request value) {
        return new JAXBElement<Request>(_Zonnepanelenrequest_QNAME, Request.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.hu.fnt.nl/berichten/response", name = "Zonnepanelenresponse")
    public JAXBElement<Response> createZonnepanelenresponse(Response value) {
        return new JAXBElement<Response>(_Zonnepanelenresponse_QNAME, Response.class, null, value);
    }

}

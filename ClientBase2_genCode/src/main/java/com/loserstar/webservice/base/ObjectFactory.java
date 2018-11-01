
package com.loserstar.webservice.base;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.loserstar.webservice.base package. 
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

    private final static QName _AddResponse_QNAME = new QName("http://base.webservice.loserstar.com/", "addResponse");
    private final static QName _Add_QNAME = new QName("http://base.webservice.loserstar.com/", "add");
    private final static QName _Tt_QNAME = new QName("http://base.webservice.loserstar.com/", "tt");
    private final static QName _TtResponse_QNAME = new QName("http://base.webservice.loserstar.com/", "ttResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.loserstar.webservice.base
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Add }
     * 
     */
    public Add createAdd() {
        return new Add();
    }

    /**
     * Create an instance of {@link Tt }
     * 
     */
    public Tt createTt() {
        return new Tt();
    }

    /**
     * Create an instance of {@link AddResponse }
     * 
     */
    public AddResponse createAddResponse() {
        return new AddResponse();
    }

    /**
     * Create an instance of {@link TtResponse }
     * 
     */
    public TtResponse createTtResponse() {
        return new TtResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://base.webservice.loserstar.com/", name = "addResponse")
    public JAXBElement<AddResponse> createAddResponse(AddResponse value) {
        return new JAXBElement<AddResponse>(_AddResponse_QNAME, AddResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Add }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://base.webservice.loserstar.com/", name = "add")
    public JAXBElement<Add> createAdd(Add value) {
        return new JAXBElement<Add>(_Add_QNAME, Add.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://base.webservice.loserstar.com/", name = "tt")
    public JAXBElement<Tt> createTt(Tt value) {
        return new JAXBElement<Tt>(_Tt_QNAME, Tt.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TtResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://base.webservice.loserstar.com/", name = "ttResponse")
    public JAXBElement<TtResponse> createTtResponse(TtResponse value) {
        return new JAXBElement<TtResponse>(_TtResponse_QNAME, TtResponse.class, null, value);
    }

}

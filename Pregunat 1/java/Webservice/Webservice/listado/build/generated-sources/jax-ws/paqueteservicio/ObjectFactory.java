
package paqueteservicio;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the paqueteservicio package. 
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

    private final static QName _Datosalumno_QNAME = new QName("http://paqueteservicio/", "datosalumno");
    private final static QName _DatosalumnoResponse_QNAME = new QName("http://paqueteservicio/", "datosalumnoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: paqueteservicio
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Datosalumno }
     * 
     */
    public Datosalumno createDatosalumno() {
        return new Datosalumno();
    }

    /**
     * Create an instance of {@link DatosalumnoResponse }
     * 
     */
    public DatosalumnoResponse createDatosalumnoResponse() {
        return new DatosalumnoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Datosalumno }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Datosalumno }{@code >}
     */
    @XmlElementDecl(namespace = "http://paqueteservicio/", name = "datosalumno")
    public JAXBElement<Datosalumno> createDatosalumno(Datosalumno value) {
        return new JAXBElement<Datosalumno>(_Datosalumno_QNAME, Datosalumno.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosalumnoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosalumnoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://paqueteservicio/", name = "datosalumnoResponse")
    public JAXBElement<DatosalumnoResponse> createDatosalumnoResponse(DatosalumnoResponse value) {
        return new JAXBElement<DatosalumnoResponse>(_DatosalumnoResponse_QNAME, DatosalumnoResponse.class, null, value);
    }

}

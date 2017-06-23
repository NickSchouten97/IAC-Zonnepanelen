
package mypackage;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for request complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="request">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="Zonkracht" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="Zonstand" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "request", propOrder = {

})
public class Request {

    @XmlElement(name = "Zonkracht", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger zonkracht;
    @XmlElement(name = "Zonstand", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger zonstand;

    /**
     * Gets the value of the zonkracht property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getZonkracht() {
        return zonkracht;
    }

    /**
     * Sets the value of the zonkracht property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setZonkracht(BigInteger value) {
        this.zonkracht = value;
    }

    /**
     * Gets the value of the zonstand property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getZonstand() {
        return zonstand;
    }

    /**
     * Sets the value of the zonstand property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setZonstand(BigInteger value) {
        this.zonstand = value;
    }

}

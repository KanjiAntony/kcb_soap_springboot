//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.06.10 at 12:26:38 PM EAT 
//


package ke.co.kanji.kcb.customers;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ken21083_kcb_creation_status" type="{http://kanji.co.ke/kcb/customers}creationStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ken21083KcbCreationStatus"
})
@XmlRootElement(name = "ken21083KcbCustomerAccountCreateResponse")
public class Ken21083KcbCustomerAccountCreateResponse {

    @XmlElement(name = "ken21083_kcb_creation_status", required = true)
    protected CreationStatus ken21083KcbCreationStatus;

    /**
     * Gets the value of the ken21083KcbCreationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CreationStatus }
     *     
     */
    public CreationStatus getKen21083KcbCreationStatus() {
        return ken21083KcbCreationStatus;
    }

    /**
     * Sets the value of the ken21083KcbCreationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreationStatus }
     *     
     */
    public void setKen21083KcbCreationStatus(CreationStatus value) {
        this.ken21083KcbCreationStatus = value;
    }

}

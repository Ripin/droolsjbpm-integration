//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.28 at 12:40:13 PM CEST 
//


package org.kie.remote.jaxb.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addContentCommand complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addContentCommand"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}taskCommand"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="jaxbContent" type="{}jaxbContent" minOccurs="0"/&gt;
 *         &lt;element name="parameter" type="{}jaxbStringObjectPairArray" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addContentCommand", propOrder = {
    "jaxbContent",
    "parameter"
})
@XmlRootElement(name = "add-content-command")
public class AddContentCommand
    extends TaskCommand
{

    protected Content jaxbContent;
    protected JaxbStringObjectPairArray parameter;

    /**
     * Gets the value of the jaxbContent property.
     * 
     * @return
     *     possible object is
     *     {@link Content }
     *     
     */
    public Content getJaxbContent() {
        return jaxbContent;
    }

    /**
     * Sets the value of the jaxbContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Content }
     *     
     */
    public void setJaxbContent(Content value) {
        this.jaxbContent = value;
    }

    /**
     * Gets the value of the parameter property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbStringObjectPairArray }
     *     
     */
    public JaxbStringObjectPairArray getParameter() {
        return parameter;
    }

    /**
     * Sets the value of the parameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbStringObjectPairArray }
     *     
     */
    public void setParameter(JaxbStringObjectPairArray value) {
        this.parameter = value;
    }

}

package com.sap.xi.basis.global;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sap.xi.basis.global package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sap.xi.basis.global
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LONGDescription }
     * 
     */
    public LONGDescription createLONGDescription() {
        return new LONGDescription();
    }

    /**
     * Create an instance of {@link Text }
     * 
     */
    public Text createText() {
        return new Text();
    }

    /**
     * Create an instance of {@link LanguageCodeContextElements }
     * 
     */
    public LanguageCodeContextElements createLanguageCodeContextElements() {
        return new LanguageCodeContextElements();
    }

}

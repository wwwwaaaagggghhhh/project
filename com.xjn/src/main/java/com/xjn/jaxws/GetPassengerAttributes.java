
package com.xjn.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 2.7.18
 * Sun Jan 14 01:32:54 GMT+08:00 2024
 * Generated source version: 2.7.18
 */

@XmlRootElement(name = "getPassengerAttributes", namespace = "http://xjn.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPassengerAttributes", namespace = "http://xjn.com/")

public class GetPassengerAttributes {

    @XmlElement(name = "arg0")
    private java.lang.String arg0;

    public java.lang.String getArg0() {
        return this.arg0;
    }

    public void setArg0(java.lang.String newArg0)  {
        this.arg0 = newArg0;
    }

}



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

@XmlRootElement(name = "getPassengerAttributesResponse", namespace = "http://xjn.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPassengerAttributesResponse", namespace = "http://xjn.com/")

public class GetPassengerAttributesResponse {

    @XmlElement(name = "return")
    private String[] _return;

    public String[] getReturn() {
        return this._return;
    }

    public void setReturn(String[] new_return)  {
        this._return = new_return;
    }

}

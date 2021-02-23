/**
 * WebServiceTUPA5Locator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class WebServiceTUPA5Locator extends org.apache.axis.client.Service implements org.tempuri.WebServiceTUPA5 {

    public WebServiceTUPA5Locator() {
    }


    public WebServiceTUPA5Locator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WebServiceTUPA5Locator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WebServiceTUPA5Soap
    private java.lang.String WebServiceTUPA5Soap_address = "http://localhost/WebApplicationTUPA5/WebServiceTUPA5.asmx";

    public java.lang.String getWebServiceTUPA5SoapAddress() {
        return WebServiceTUPA5Soap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WebServiceTUPA5SoapWSDDServiceName = "WebServiceTUPA5Soap";

    public java.lang.String getWebServiceTUPA5SoapWSDDServiceName() {
        return WebServiceTUPA5SoapWSDDServiceName;
    }

    public void setWebServiceTUPA5SoapWSDDServiceName(java.lang.String name) {
        WebServiceTUPA5SoapWSDDServiceName = name;
    }

    public org.tempuri.WebServiceTUPA5Soap getWebServiceTUPA5Soap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WebServiceTUPA5Soap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWebServiceTUPA5Soap(endpoint);
    }

    public org.tempuri.WebServiceTUPA5Soap getWebServiceTUPA5Soap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.tempuri.WebServiceTUPA5SoapStub _stub = new org.tempuri.WebServiceTUPA5SoapStub(portAddress, this);
            _stub.setPortName(getWebServiceTUPA5SoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWebServiceTUPA5SoapEndpointAddress(java.lang.String address) {
        WebServiceTUPA5Soap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.tempuri.WebServiceTUPA5Soap.class.isAssignableFrom(serviceEndpointInterface)) {
                org.tempuri.WebServiceTUPA5SoapStub _stub = new org.tempuri.WebServiceTUPA5SoapStub(new java.net.URL(WebServiceTUPA5Soap_address), this);
                _stub.setPortName(getWebServiceTUPA5SoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("WebServiceTUPA5Soap".equals(inputPortName)) {
            return getWebServiceTUPA5Soap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "WebServiceTUPA5");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "WebServiceTUPA5Soap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WebServiceTUPA5Soap".equals(portName)) {
            setWebServiceTUPA5SoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}

/**
 * TaxProcedureServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package client;

import javax.xml.ws.Endpoint;
import javax.jws.WebService;


public class TaxProcedureServiceLocator extends org.apache.axis.client.Service implements client.TaxProcedureService {

    public TaxProcedureServiceLocator() {
    }


    public TaxProcedureServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public TaxProcedureServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for taxProcedure
    private java.lang.String taxProcedure_address = "http://localhost:8080//services/example/taxProcedure";

    public java.lang.String gettaxProcedureAddress() {
        return taxProcedure_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String taxProcedureWSDDServiceName = "taxProcedure";

    public java.lang.String gettaxProcedureWSDDServiceName() {
        return taxProcedureWSDDServiceName;
    }

    public void settaxProcedureWSDDServiceName(java.lang.String name) {
        taxProcedureWSDDServiceName = name;
    }

    public client.TaxProcedure_PortType gettaxProcedure() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(taxProcedure_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return gettaxProcedure(endpoint);
    }

    public client.TaxProcedure_PortType gettaxProcedure(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            client.TaxProcedureSoapBindingStub _stub = new client.TaxProcedureSoapBindingStub(portAddress, this);
            _stub.setPortName(gettaxProcedureWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void settaxProcedureEndpointAddress(java.lang.String address) {
        taxProcedure_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (client.TaxProcedure_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                client.TaxProcedureSoapBindingStub _stub = new client.TaxProcedureSoapBindingStub(new java.net.URL(taxProcedure_address), this);
                _stub.setPortName(gettaxProcedureWSDDServiceName());
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
        if ("taxProcedure".equals(inputPortName)) {
            return gettaxProcedure();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://example", "taxProcedureService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://example", "taxProcedure"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("taxProcedure".equals(portName)) {
            settaxProcedureEndpointAddress(address);
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

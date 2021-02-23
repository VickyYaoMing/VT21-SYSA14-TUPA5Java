package org.tempuri;

public class WebServiceTUPA5SoapProxy implements org.tempuri.WebServiceTUPA5Soap {
  private String _endpoint = null;
  private org.tempuri.WebServiceTUPA5Soap webServiceTUPA5Soap = null;
  
  public WebServiceTUPA5SoapProxy() {
    _initWebServiceTUPA5SoapProxy();
  }
  
  public WebServiceTUPA5SoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initWebServiceTUPA5SoapProxy();
  }
  
  private void _initWebServiceTUPA5SoapProxy() {
    try {
      webServiceTUPA5Soap = (new org.tempuri.WebServiceTUPA5Locator()).getWebServiceTUPA5Soap();
      if (webServiceTUPA5Soap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)webServiceTUPA5Soap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)webServiceTUPA5Soap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (webServiceTUPA5Soap != null)
      ((javax.xml.rpc.Stub)webServiceTUPA5Soap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.WebServiceTUPA5Soap getWebServiceTUPA5Soap() {
    if (webServiceTUPA5Soap == null)
      _initWebServiceTUPA5SoapProxy();
    return webServiceTUPA5Soap;
  }
  
  public org.tempuri.CRONUS_Sverige_AB_Employee[] getEmployees() throws java.rmi.RemoteException{
    if (webServiceTUPA5Soap == null)
      _initWebServiceTUPA5SoapProxy();
    return webServiceTUPA5Soap.getEmployees();
  }
  
  public void addEmployee(java.lang.String no_, java.lang.String first_Name, java.lang.String last_Name, java.lang.String job_Title, java.lang.String address, java.lang.String phone_No_, java.lang.String e_Mail) throws java.rmi.RemoteException{
    if (webServiceTUPA5Soap == null)
      _initWebServiceTUPA5SoapProxy();
    webServiceTUPA5Soap.addEmployee(no_, first_Name, last_Name, job_Title, address, phone_No_, e_Mail);
  }
  
  public void updateEmployee(java.lang.String no_, java.lang.String first_Name, java.lang.String last_Name, java.lang.String job_Title, java.lang.String address, java.lang.String phone_No_, java.lang.String e_Mail) throws java.rmi.RemoteException{
    if (webServiceTUPA5Soap == null)
      _initWebServiceTUPA5SoapProxy();
    webServiceTUPA5Soap.updateEmployee(no_, first_Name, last_Name, job_Title, address, phone_No_, e_Mail);
  }
  
  public void deleteEmployee(java.lang.String no_) throws java.rmi.RemoteException{
    if (webServiceTUPA5Soap == null)
      _initWebServiceTUPA5SoapProxy();
    webServiceTUPA5Soap.deleteEmployee(no_);
  }
  
  
}
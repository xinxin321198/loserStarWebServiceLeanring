package com.loserstar.webservice.base;

public class TestServiceProxy implements com.loserstar.webservice.base.TestService {
  private String _endpoint = null;
  private com.loserstar.webservice.base.TestService testService = null;
  
  public TestServiceProxy() {
    _initTestServiceProxy();
  }
  
  public TestServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initTestServiceProxy();
  }
  
  private void _initTestServiceProxy() {
    try {
      testService = (new com.loserstar.webservice.base.TestServiceImpServiceLocator()).getTestServiceImpPort();
      if (testService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)testService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)testService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (testService != null)
      ((javax.xml.rpc.Stub)testService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.loserstar.webservice.base.TestService getTestService() {
    if (testService == null)
      _initTestServiceProxy();
    return testService;
  }
  
  public java.lang.String add(java.lang.String a) throws java.rmi.RemoteException{
    if (testService == null)
      _initTestServiceProxy();
    return testService.add(a);
  }
  
  public void tt() throws java.rmi.RemoteException{
    if (testService == null)
      _initTestServiceProxy();
    testService.tt();
  }
  
  
}
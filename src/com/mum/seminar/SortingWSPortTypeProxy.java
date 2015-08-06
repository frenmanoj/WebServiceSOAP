package com.mum.seminar;

public class SortingWSPortTypeProxy implements com.mum.seminar.SortingWSPortType {
  private String _endpoint = null;
  private com.mum.seminar.SortingWSPortType sortingWSPortType = null;
  
  public SortingWSPortTypeProxy() {
    _initSortingWSPortTypeProxy();
  }
  
  public SortingWSPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initSortingWSPortTypeProxy();
  }
  
  private void _initSortingWSPortTypeProxy() {
    try {
      sortingWSPortType = (new com.mum.seminar.SortingWSLocator()).getSortingWSHttpSoap11Endpoint();
      if (sortingWSPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sortingWSPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sortingWSPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sortingWSPortType != null)
      ((javax.xml.rpc.Stub)sortingWSPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.mum.seminar.SortingWSPortType getSortingWSPortType() {
    if (sortingWSPortType == null)
      _initSortingWSPortTypeProxy();
    return sortingWSPortType;
  }
  
  public int[] sort(int[] arr) throws java.rmi.RemoteException{
    if (sortingWSPortType == null)
      _initSortingWSPortTypeProxy();
    return sortingWSPortType.sort(arr);
  }
  
  
}
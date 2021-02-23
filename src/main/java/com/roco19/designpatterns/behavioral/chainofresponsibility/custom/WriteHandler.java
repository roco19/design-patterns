package com.roco19.designpatterns.behavioral.chainofresponsibility.custom;

public class WriteHandler extends Handler {
  public WriteHandler(Handler nextHandler) {
    super(nextHandler);
  }

  @Override
  protected void internalHandle(RequestType requestType, String userId) {
    if (requestType == RequestType.WRITE || requestType == RequestType.ALL) {
      System.out.println("Writing user: " + userId);
    }
  }
}

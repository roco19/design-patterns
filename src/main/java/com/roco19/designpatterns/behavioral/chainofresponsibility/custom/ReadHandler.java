package com.roco19.designpatterns.behavioral.chainofresponsibility.custom;

public class ReadHandler extends Handler {
  public ReadHandler(Handler nextHandler) {
    super(nextHandler);
  }

  @Override
  protected void internalHandle(RequestType requestType, String userId) {
    if (requestType == RequestType.READ || requestType == RequestType.ALL) {
      System.out.println("Reading user: " + userId);
    }
  }
}

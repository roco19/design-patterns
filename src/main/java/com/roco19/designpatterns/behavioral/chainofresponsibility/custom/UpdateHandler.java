package com.roco19.designpatterns.behavioral.chainofresponsibility.custom;

public class UpdateHandler extends Handler {
  public UpdateHandler(Handler nextHandler) {
    super(nextHandler);
  }

  @Override
  protected void internalHandle(RequestType requestType, String userId) {
    if (requestType == RequestType.UPDATE || requestType == RequestType.ALL) {
      System.out.println("Updating user: " + userId);
    }
  }
}

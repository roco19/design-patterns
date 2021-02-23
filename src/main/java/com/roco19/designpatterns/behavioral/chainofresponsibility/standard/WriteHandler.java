package com.roco19.designpatterns.behavioral.chainofresponsibility.standard;

public class WriteHandler extends Handler {
  public WriteHandler(Handler nextHandler) {
    super(nextHandler);
  }

  @Override
  public void handleRequest(RequestType requestType, String userId) {
    if (RequestType.WRITE == requestType) {
      // Process the data
      System.out.println("Writing user: " + userId);
    } else {
      super.handleRequest(requestType, userId);
    }
  }
}

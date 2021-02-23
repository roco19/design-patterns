package com.roco19.designpatterns.behavioral.chainofresponsibility.standard;

public class ReadHandler extends Handler {
  public ReadHandler(Handler nextHandler) {
    super(nextHandler);
  }

  @Override
  public void handleRequest(RequestType requestType, String userId) {
    if (RequestType.READ == requestType) {
      // Process the data
      System.out.println("Reading user: " + userId);
    } else {
      super.handleRequest(requestType, userId);
    }
  }
}

package com.roco19.designpatterns.behavioral.chainofresponsibility.standard;

public class UpdateHandler extends Handler {
  public UpdateHandler(Handler nextHandler) {
    super(nextHandler);
  }

  @Override
  public void handleRequest(RequestType requestType, String userId) {
    if (RequestType.UPDATE == requestType) {
      // Process the data
      System.out.println("Updating user: " + userId);
    } else {
      super.handleRequest(requestType, userId);
    }
  }
}

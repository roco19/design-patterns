package com.roco19.designpatterns.behavioral.chainofresponsibility.standard;

public abstract class Handler {
  private Handler nextHandler;

  public Handler(Handler nextHandler) {
    this.nextHandler = nextHandler;
  }

  // Common behavior to all elements that extends the Handler class and doesn't override the
  // handlerRequest method.
  // The default behavior is to pass the request to the next handler if it exists.
  public void handleRequest(RequestType requestType, String userId) {
    if (nextHandler != null) {
      nextHandler.handleRequest(requestType, userId);
    }
  }
}

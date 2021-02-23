package com.roco19.designpatterns.behavioral.chainofresponsibility.custom;

public abstract class Handler {
  private Handler nextHandler;

  public Handler(Handler nextHandler) {
    this.nextHandler = nextHandler;
  }

  // Common behavior to all elements that extends the Handler class.
  // It calls the internal handler and then it calls the next element in the chain functionality.
  public final void handleRequest(RequestType requestType, String userId) {
    internalHandle(requestType, userId);
    if (nextHandler != null) {
      nextHandler.handleRequest(requestType, userId);
    }
  }

  // This method forces the child classes to define an implementation.
  // This method decouples the child class from their siblings.
  protected abstract void internalHandle(RequestType requestType, String userId);
}

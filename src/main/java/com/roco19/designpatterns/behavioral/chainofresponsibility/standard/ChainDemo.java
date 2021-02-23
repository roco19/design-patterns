package com.roco19.designpatterns.behavioral.chainofresponsibility.standard;

/**
 * Standard Chain of Responsibility.
 *
 * <p>One of the implementations proposed by the Gang of Four (GoF). Every element in the chain
 * overrides a default method. The elements need to delegate the request to the next element if it
 * can't handle it.
 */
public final class ChainDemo {
  public static void main(String[] args) {
    final String userId = "Roco19";
    final Handler initialHandler = getChainOfResponsibility();

    System.out.print("First execution: ");
    initialHandler.handleRequest(RequestType.UPDATE, userId);

    System.out.print("Second execution: ");
    initialHandler.handleRequest(RequestType.READ, userId);

    System.out.print("Third execution: ");
    initialHandler.handleRequest(RequestType.WRITE, userId);
  }

  private static Handler getChainOfResponsibility() {
    Handler readHandler = new ReadHandler(null); // innermost element in the chain
    Handler writeHandler = new WriteHandler(readHandler);
    return new UpdateHandler(writeHandler); // outermost element in the chain
  }
}

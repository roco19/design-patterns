package com.roco19.designpatterns.behavioral.chainofresponsibility.custom;

/**
 * Custom Chain of Responsibility.
 *
 * <p>This custom chain allows to execute all the elements in the chain instead of only one, also it
 * adds a new protected internal method that decouples the elements from the chain from their
 * siblings.
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

    System.out.println("\nFourth execution: ");
    initialHandler.handleRequest(RequestType.ALL, userId);
  }

  private static Handler getChainOfResponsibility() {
    Handler readHandler = new ReadHandler(null); // innermost element in the chain
    Handler writeHandler = new WriteHandler(readHandler);
    return new UpdateHandler(writeHandler); // outermost element in the chain
  }
}

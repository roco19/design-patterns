package com.example.chain;

public class SecondHandler extends Handler {

    public SecondHandler() {

    }

    public SecondHandler(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected void internalHandleRequest(String request) {
        System.out.println("Second handler: " + request);
    }
}

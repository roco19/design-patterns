package com.example.chain;

public class FirstHandler extends Handler {

    public FirstHandler() {

    }

    public FirstHandler(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected void internalHandleRequest(String request) {
        System.out.println("First handler: " + request);
    }
}

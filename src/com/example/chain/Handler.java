package com.example.chain;

public abstract class Handler {
    private Handler nextHandler;

    public Handler() {

    }

    public Handler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public Handler setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
        return this.nextHandler;
    }

    public void handleRequest(String request) {
        internalHandleRequest(request);
        if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }

    protected abstract void internalHandleRequest(String request);
}

package com.example.main;

import com.example.chain.FirstHandler;
import com.example.chain.Handler;
import com.example.chain.SecondHandler;

public class ChainOfResponsibilityDemo {
    // Init method
    public static void main(String[] args) {
        Handler handler = getChainOfResponsibility();
        handler.handleRequest("Request");
    }

    public static Handler getChainOfResponsibility() {
        Handler handler = new FirstHandler();
        handler
            .setNextHandler(new SecondHandler())
            .setNextHandler(new FirstHandler())
            .setNextHandler(new SecondHandler());
        return handler;
    }
}

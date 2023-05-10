package com.example.demoaop;

import org.springframework.stereotype.Component;

@Component
public class Message {

    public void generateMessage(String name) {
        System.out.println("Welcome, " + name);
    }

    public void operations(int count) {
        System.out.println("Operations in progress...");
        int result = 1000 / count;
        System.out.println("Result of operations: " + result);
    }

    public int operationsWithResult(int input) {

        System.out.println("Operations 2 in progress...");
        return input * 10;

    }


}

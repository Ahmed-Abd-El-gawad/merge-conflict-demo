package com.mycompany.app;

public class App {

    private static final String MESSAGE = "Hello World!test2";

    public App() {}

    public static void main(String[] args) {
        System.out.println(MESSAGE);
    }

    public String getMessage() {
        return MESSAGE;
    }
}

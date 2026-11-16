package com.example.week11;

@FunctionalInterface
interface Greeting {
    String greet(String name);
}

public class GreetingDemo {
    public static void main(String[] args) {
        Greeting hello = name -> "Hello, " + name;
        Greeting hi = name -> "Hi, " + name + "!";
        System.out.println(hello.greet("Ada"));
        System.out.println(hi.greet("Bob"));
    }
}

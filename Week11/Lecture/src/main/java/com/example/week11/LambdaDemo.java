package com.example.week11;

import java.util.ArrayList;
import java.util.List;

public class LambdaDemo {
    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from an anonymous inner class");
            }
        };
        Runnable r2 = () -> System.out.println("Hello from a lambda expression");
        r1.run();
        r2.run();

        List<String> names = new ArrayList<>(
                List.of("Dana", "Bob", "Christopher", "Al"));
        names.sort((a, b) -> a.length() - b.length());
        System.out.println(names);
    }
}

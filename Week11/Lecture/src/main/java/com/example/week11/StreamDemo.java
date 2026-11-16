package com.example.week11;

import java.util.List;

public class StreamDemo {
    public static void main(String[] args) {
        List<String> names =
                List.of("Ada", "Bob", "Christopher", "Dana", "Eve");
        names.stream()
                .filter(n -> n.length() == 3)
                .forEach(n -> System.out.println(n));
        long count = names.stream().filter(n -> n.length() > 3).count();
        System.out.println("Long names: " + count);
        List<String> upper = names.stream()
                .map(n -> n.toUpperCase())
                .toList();
        System.out.println(upper);
        System.out.println(names);
    }
}

package com.example.week11;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionDemo {
    public static void main(String[] args) {
        Predicate<Integer> isEven = n -> n % 2 == 0;
        Function<String, Integer> length = s -> s.length();
        Consumer<String> shout = s -> System.out.println(s.toUpperCase());
        Supplier<String> greeting = () -> "Hello";
        System.out.println(isEven.test(4));
        System.out.println(length.apply("Java"));
        shout.accept("lambda");
        System.out.println(greeting.get());
    }
}

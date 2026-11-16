package com.example.week11;

import java.util.List;

public class StudentStreams {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Ada", 85), new Student("Bob", 42),
                new Student("Cy", 67), new Student("Dana", 91));
        List<String> passed = students.stream()
                .filter(s -> s.getGrade() >= 50)
                .map(s -> s.getName())
                .toList();
        System.out.println("Passed: " + passed);
        int total = students.stream().mapToInt(s -> s.getGrade()).sum();
        System.out.println("Total: " + total);
        students.stream()
                .filter(s -> s.getGrade() >= 90)
                .forEach(s -> System.out.println("Top: " + s));
    }
}

package com.example.week11;

public class Student {
    private final String name;
    private final int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() { return name; }

    public int getGrade() { return grade; }

    @Override
    public String toString() { return name + " (" + grade + ")"; }
}

package com.subs.alphawizard.JAVA8;

import java.util.Objects;

public class Students {
    private int marks;
    private String name;

    public Students() {
    }

    public Students(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return marks == students.marks && Objects.equals(name, students.name);
    }

    @Override
    public String toString() {
        return "Students{" +
                "marks=" + marks +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(marks, name);
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

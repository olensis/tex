package org.example;

import java.util.Set;
import java.util.TreeSet;

public class User {
    String name;
    int age;

    public User (String name, int a) {
        this.name = name;
        this.age = a;
    }

    public String Name() {
        return name;
    }

    public void NewName(String name) {
        this.name = name;
    }

    public int value() {
        return age;
    }

    public void NewAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Name: " + this.name + "-- age: " + this.age;
    }
}

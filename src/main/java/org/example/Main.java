package org.example;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<User> users = new TreeSet<User>(new Sorting());

        // выбрала TreeSet, потому что там не может быть дублей и ThreeSet сортирует

        users.add(new User("Kat", 20));
        users.add(new User("Man", 22));

        System.out.println("Самый старый пользователь " + users.last());
    }
}
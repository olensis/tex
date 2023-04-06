package org.example;

import java.util.Comparator;

public class Sorting implements Comparator<User> {

    public int compare(User age1, User age2) {
        if (age1.value() > age2.value()) {
            return 1;
        } else {
            return -1;
        }
    }
}

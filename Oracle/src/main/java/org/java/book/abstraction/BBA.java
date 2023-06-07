package org.java.book.abstraction;

public class BBA extends Department {
    @Override
    public String deptName(String name) {
        if (name.equals("BBA")) {
            return "Welcome to " + name + " Ceremony!";
        }
        return "Welcome to the Ceremony!";
    }
}

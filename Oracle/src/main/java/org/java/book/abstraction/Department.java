package org.java.book.abstraction;

// abstract class
public abstract class Department {

    // abstract method
    public abstract String deptName(String name); // signature of the method

    // non-abstract method
    public String buildingNo(String depName, String buildingNo) {
        return "Not valid department";
    };
}

class EEE extends Department {
    @Override
    public String deptName(String name) {
        if (name.equals("EEE")) {
            return "Welcome to " + name;
        }
        return name;
    }

    @Override
    public String buildingNo(String depName, String buildingNo) {
        if (depName == "EEE") {
            return "E101";
        }
        return "A101";
    }
}
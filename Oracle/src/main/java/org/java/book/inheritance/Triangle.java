package org.java.book.inheritance;

// super class [base class, parent class]
public class Triangle {
    String scannerId = "9OA1";
    public float Area(float b, float h) {
        return (b*h) / 2;
    }

    public Triangle() {
        System.out.println("Triangle constructor invoked");
    }

    public String congratulate() {
        System.out.println("Congratulations from Triangle!!");
        return "Congratulations from Triangle!!";
    }
}

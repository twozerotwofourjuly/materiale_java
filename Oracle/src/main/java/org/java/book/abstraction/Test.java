package org.java.book.abstraction;

public class Test {

    public static int writeCheck() {
        Check check; // reference variable

        check = new Write(1);

        return check.get();
    }
    public static void main(String[] args) {
        Check check; // reference variable

        check = new Read(0);
        System.out.println(check.get());
        System.out.println(writeCheck());
    }
}

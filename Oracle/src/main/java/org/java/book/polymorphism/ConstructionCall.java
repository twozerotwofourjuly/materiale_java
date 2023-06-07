package org.java.book.polymorphism;

public class ConstructionCall {
    public String check(int op) {
        Construction construction;
        if (op == 1) {
            construction = new Bridge();
            //System.out.println(construction.SalaryRange());
            return construction.SalaryRange();
        } else {
            construction = new Building();
            //System.out.println(construction.SalaryRange());
            return construction.SalaryRange();
        }
    }

    public static void main(String[] args) {
        Construction construction; // reference variable

        construction = new Bridge();
        System.out.println(construction.SalaryRange());

        construction = new Building();
        System.out.println(construction.SalaryRange());
    }
}

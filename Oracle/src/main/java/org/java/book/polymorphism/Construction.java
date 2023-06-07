package org.java.book.polymorphism;

public class Construction {
    public String SalaryRange() {
        //System.out.println("$10,000 - $100,000"); // default
        return "$10,000 - $100,000";
    }
}

class Bridge extends Construction {
    @Override
    public String SalaryRange() {
        System.out.println(super.SalaryRange());
        return super.SalaryRange();
    }
}

class Building extends Construction {
    @Override
    public String SalaryRange() {
        //System.out.println("$58,610 - $98,453");
        return "$58,610 - $98,453";
    }
}
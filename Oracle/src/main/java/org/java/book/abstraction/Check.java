package org.java.book.abstraction;


// abstract class
public abstract class Check {
    public abstract int get();
}

class Read extends Check {
    private int op;

    public Read(int op) {
        this.op = op;
    }
    @Override
    public int get() {
        return op;
    }
}

class Write extends Check {
    private int op;

    public Write(int op) {
        this.op = op;
    }
    @Override
    public int get() {
        return op;
    }
}


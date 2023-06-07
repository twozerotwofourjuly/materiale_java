package org.java.book.inheritance;

public class BlockTriangle extends Triangle {
    String scannerId = "BG0O";
    public String twiceArea(float area) {
        return String.valueOf(2 * area);
    }

    public BlockTriangle() {
        super(); // invoking the constructor of Triangle
        System.out.println("BlockTriangle constructor invoked");
    }

    public String congratulate() {
        System.out.println("Congratulations from BlockTriangle!!");
        return "Congratulations from BlockTriangle!!";
    }

    public void superCheck() {
        new BlockTriangle().congratulate(); // invoking the method of BlockTriangle
        super.congratulate(); // invoking the method of Triangle

        System.out.println("BlockTriangle: " + new BlockTriangle().scannerId); // invoking the variable of BlockTriangle
        System.out.println("Triangle: " + super.scannerId); // invoking the variable of Triangle
    }

    public String supCheck() {
        return super.congratulate();
    }

    public static void main(String[] args) {
        BlockTriangle blockTriangle = new BlockTriangle();

        System.out.println(
                blockTriangle.twiceArea(blockTriangle.Area(8.283f, 4.061f))
        );

        blockTriangle.superCheck();
    }
}

package org.java.book.encapsulation;

public class Capsule {
    /**
     * @data members
     */
    private int id;
    private String name;
    private String position;

    // setter - id
    public void setId(int capId) {
        id = capId;
    }
    // getter - id
    public int getId() {
        return id;
    }

    // setter - name
    public void setName(String capName) {
        name = capName;
    }
    // getter - name
    public String getName() {
        return name;
    }

    // setter - position
    public void setPosition(String position) {
        this.position = position;
    }
    // getter - position
    public String getPosition() {
        return position;
    }

}

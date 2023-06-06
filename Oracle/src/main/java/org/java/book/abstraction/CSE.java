package org.java.book.abstraction;

public class CSE extends Department {
    @Override
    public String deptName(String name) {
        return name;
    }

    @Override
    public String buildingNo(String depName, String buildingNo) {
        if (depName == "CSE") {
            return "CX01";
        }
        return "A101";
    }
}

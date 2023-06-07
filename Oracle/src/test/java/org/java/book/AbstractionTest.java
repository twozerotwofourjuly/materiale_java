package org.java.book;

import org.java.book.abstraction.BBA;
import org.java.book.abstraction.CSE;
import org.java.book.abstraction.Department;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AbstractionTest {
    @Test
    public void CSECheck() {
        CSE cse = new CSE();

        assertEquals("ENG", cse.deptName("ENG"));
        assertEquals("CX01", cse.buildingNo(cse.deptName("CSE"), ""));
    }

    @Test
    public void BBACheck() {
        BBA bba = new BBA();

        assertEquals("Welcome to BBA Ceremony!", bba.deptName("BBA"));
        assertEquals("Not valid department", bba.buildingNo("BBA", ""));
    }

}

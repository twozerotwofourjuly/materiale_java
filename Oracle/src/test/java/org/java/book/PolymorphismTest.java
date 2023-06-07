package org.java.book;


import org.java.book.polymorphism.Construction;
import org.java.book.polymorphism.ConstructionCall;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PolymorphismTest {
    @Test
    public void firstCheck() {
        ConstructionCall constructionCall = new ConstructionCall();

        assertEquals("$10,000 - $100,000", constructionCall.check(1));
        assertEquals("$58,610 - $98,453", constructionCall.check(2));
    }

    @Test
    public void m() {
        Construction construction = new Construction();

        assertEquals("$10,000 - $100,000", construction.SalaryRange());
    }
}

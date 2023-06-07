package org.java.book;

import org.java.book.inheritance.BlockTriangle;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InheritanceTest {
    @Test
    public void inCheck() {
        BlockTriangle blockTriangle = new BlockTriangle();
        assertEquals("33.63726", blockTriangle.twiceArea(blockTriangle.Area(8.283f, 4.061f)));
    }

    @Test
    public void superKeywordCheck() {
        assertEquals("Congratulations from BlockTriangle!!", new BlockTriangle().congratulate());
        assertEquals("Congratulations from Triangle!!", new BlockTriangle().supCheck());
    }
}

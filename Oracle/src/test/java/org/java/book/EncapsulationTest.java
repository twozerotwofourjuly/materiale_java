package org.java.book;

import org.java.book.encapsulation.Capsule;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EncapsulationTest {
    @Test
    public void check1() {
        Capsule capsule = new Capsule();
        Capsule capsule2 = new Capsule();

        capsule.setId(10205430);
        capsule.setName("John Doe");
        capsule.setPosition("Engineer");
        assertEquals(10205430, capsule.getId());
        assertEquals("John Doe", capsule.getName());
        assertEquals("Engineer", capsule.getPosition());

        capsule2.setId(40102478);
        capsule2.setName("Mike");
        capsule2.setPosition("Astronaut");
        assertEquals(40102478, capsule2.getId());
        assertEquals("Mike", capsule2.getName());
        assertEquals("Astronaut", capsule2.getPosition());
    }
}

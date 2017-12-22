package com.faisal.javabpracs.Generics;

import org.junit.Test;

import static org.junit.Assert.*;

public class GenericMethodTest {

    @Test
    public void testIsEqual() {
        GenericClass<String> g1 = new GenericClass<String>();
        g1.setT("Faisal");
        GenericClass<String> g2 = new GenericClass<String>();
        g2.setT("Morensya");

        boolean expectedValue = GenericMethod.isEqual(g1, g2);
        assertEquals(false, expectedValue);

        g1.setT("Faisal");
        g2.setT("Faisal");
        expectedValue = GenericMethod.isEqual(g1, g2);
        assertEquals(true, expectedValue);
    }
}
package com.faisal.javabpracs.Generics;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by faisalmorensya on 22/12/17.
 */
public class GenericClassTest {

    @Test
    public void testUsingRawType() {
        GenericClass type = new GenericClass();

        type.setT("Hello");
        assertEquals("Hello", type.getT());

        type.setT(10);
        assertEquals(10, type.getT());
    }
}
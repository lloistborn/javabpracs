package com.faisal.javabpracs.Generics;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class GenericWildCardTest {

    @Test
    public void testSum() {
        List<Integer> ints = new ArrayList<>();

        ints.add(1);
        ints.add(2);
        ints.add(3);

        double expectedValue = 6;
        double actualValue = GenericWildCard.sum(ints);
        double epsilon = 0;

        assertEquals(expectedValue, actualValue, epsilon);
    }

    @Test
    public void testListData() {
        List<Integer> ints = new ArrayList<>();

        ints.add(1);
        ints.add(2);
        ints.add(3);

        assertNotNull(GenericWildCard.listData(ints));
    }
}
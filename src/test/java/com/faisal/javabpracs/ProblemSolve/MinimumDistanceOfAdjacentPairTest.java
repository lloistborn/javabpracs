package com.faisal.javabpracs.ProblemSolve;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumDistanceOfAdjacentPairTest {

    @Test
    public void testSolution() {
        int[] array = new int[]{0, 3, 3, 7, 8};

        int result = MinimumDistanceOfAdjacentPair.solution(array);
        assertEquals(result, 0);
    }
}

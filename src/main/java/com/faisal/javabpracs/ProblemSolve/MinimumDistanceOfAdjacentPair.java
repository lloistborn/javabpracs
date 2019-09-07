package com.faisal.javabpracs.ProblemSolve;

import static java.util.Arrays.sort;

/**
 * Indices P and Q are adjacent pair when there is no value X in array A such that A[P] < X < A[Q] or A[P] > X > A[Q]
 * The distance of adjacent pair is abs(A[P] - A[Q])
 * Given non-empty zero-indexed array, find the minimum distance among all adjacent pairs in the array
 * Return -2 if there are no adjacent pairs
 * Return -1 if the distance is greater than 100M
 *
 * Expected time complexity: O(nlogn)
 * Expected space complexity: O(n)
 */

public class MinimumDistanceOfAdjacentPair {

    public static int solution(int[] array) {

        if (array.length == 1) {
            return -2;
        }

        long minDistance = Long.MAX_VALUE;
        sort(array);

        for (int i = 1; i < array.length; i++) {
            long distance = (long) array[i] - array[i-1];
            if (distance < minDistance) {
                minDistance = distance;
            }
        }

        return minDistance > 100000000 ? -1 : (int) minDistance;
    }
}

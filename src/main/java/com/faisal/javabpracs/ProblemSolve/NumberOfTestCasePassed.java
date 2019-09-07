package com.faisal.javabpracs.ProblemSolve;

import com.google.common.base.Strings;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.sort;

/**
 * Given the names and the results of all test cases, return the number and points scored.
 *
 * T and R are arrays (containing string) of length N.
 * T[i] is a string corresponding to the i-th test case name;
 * R[i] is the result of this test case,
 * containing one of our possible values ("OK", "Wrong Answer", "Time limit exceeded" or "Runtime error")
 *
 * For example data:
 *
 * T[0] = "test1a"  R[0] = "Wrong answer"
 * T[1] = "test2"   R[1] = "OK"
 * T[2] = "test1b"  R[2] = "Runtime error"
 * T[3] = "test1c"  R[3] = "OK"
 * T[4] = "test3"   R[4] = "Time Limit Exceeded"
 *
 * the function should return 33 (1 * 100 / 3 = 33), since the test only passed the second group.
 * */

public class NumberOfTestCasePassed {

    public static void main(String[] args) {
        String[] T = new String[] {
                "T[0] = \"test1a\"",
                "T[1] = \"test2\"",
                "T[2] = \"test1c\"",
                "T[3] = \"test1b\"",
                "T[4] = \"test3\""
        };

        String[] R = new String[] {
                "R[0] = \"Wrong Answer\"",
                "R[1] = \"OK\"",
                "R[2] = \"Runtime Error\"",
                "R[3] = \"OK\"",
                "R[4] = \"Time Limit Exceeded\""
        };

        System.out.println(solution(T, R));
    }

    public static int solution(String[] T, String[] R) {
        return 0;
    }
}

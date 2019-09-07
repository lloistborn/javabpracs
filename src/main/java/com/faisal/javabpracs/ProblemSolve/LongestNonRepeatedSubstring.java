package com.faisal.javabpracs.ProblemSolve;


// 'aaa' => 'a'
// 'abcdaefgh' => 'bcdaefgh'
// 'hello grab' => 'lo grab'
// _.contains('abc', 'a')

public class LongestNonRepeatedSubstring {

    private boolean repeatedString = false;


}

//        function longestNonRepeatingSubstring(inputString) {
//        let repeatedString = false;
//        let lastIndexRepeatedString = 0;
//        let strRepeatingSubString = "";
//        let objRepeatingSubtring = [];
//        let lenInputStr = inputString.length;
//
//        while (repeatedString == false) {
//
//        for (let i = lastIndexRepeatedString; i < lenInputStr - 1; i++) {
//
//        if(!_.contains(strRepeatingSubString, inputString[i])) {
//        strRepeatingSubString += inputString[i]
//        } else {
//        lastIndexRepeatedString = i;
//        objRepeatingSubtring.add(strRepeatingSubString);
//        }
//        }
//        }
//
//        return objRepeatingSubtring;
//        }
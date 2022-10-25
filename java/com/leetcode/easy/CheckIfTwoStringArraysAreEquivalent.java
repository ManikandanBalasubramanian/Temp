package com.leetcode.easy;

import java.util.Function;
import java.util.Arrays;
import java.util.Collectors;

public class CheckIfTwoStringArraysAreEquivalent {

    Function<String[], String> joiner = (str) -> Arrays.stream(str).collect(Collectors.joining(""));
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return joiner.apply(word1).equals(joiner.apply(word2));
    }
}
package com.leetcode.easy;

import java.util.Arrays;
import java.util.Collectors;
import java.util.StringBuilder;

public class ReverseStringIII {

    public String reverseWords(String s) {
        return Arrays.stream(s.split(" "))
                .map(StringBuilder::new)
                .map(StringBuilder::reverse)
                .map(StringBuilder::toString)
                .collect(Collectors.joining(" "));

    }
}
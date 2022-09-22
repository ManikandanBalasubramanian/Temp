package com.leetcode.easy;

import java.util.Arrays;
import java.util.Collectors;
import java.util.StringBuilder;

public class ReverseStringIII {

    public String reverseWords(String s) {
        return Arrays.stream(s.split(" "))
            .map(str -> {
                StringBuilder sb = new StringBuilder(str);  
                sb.reverse();
                return sb.toString();
            })
            .collect(Collectors.joining(" "));        
        
    }
}
package com.leetcode.easy;

public class RepeatedSubStringPattern {

    public boolean repeatedSubstringPattern(String s) {
        int idx = (s + s).indexOf(s, 1);
        return  idx < s.length();
    }
}
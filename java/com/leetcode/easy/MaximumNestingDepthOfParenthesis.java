package com.leetcode.easy;

public class MaximumNestingDepthOfParenthesis {

    public int maxDepth(String s) {
        int depth = 0; 
        int count = 0;     
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                count++;
            }
            depth = Math.max(depth, count);
            if (s.charAt(i) == ')') {
                count--;
            }
        }
        return depth;
    }
}
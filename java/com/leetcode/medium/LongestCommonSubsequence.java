package com.leetcode.medium;

public class LongestCommonSubsequence {

    public int longestCommonSubsequence(String s1, String s2) {

        int[] next = new int[s2.length() + 1], curr = new int[s2.length() + 1];

        for (int i = s1.length() - 1; i >= 0; i--) {
            for (int j = s2.length() - 1; j >= 0; j--) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    curr[j] = 1 + next[j + 1];
                } else {
                    curr[j] = Math.max(curr[j + 1], next[j]);
                }
            }
            next = curr.clone();
        }

        return next[0];
    }
}
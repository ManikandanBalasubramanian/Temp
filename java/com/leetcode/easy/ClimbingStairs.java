package com.leetcode.easy;

public class ClimbingStairs {

    public int climbStairs(int n) {
        int curr = 1;
        int prev = 0;

        for (int i = 0; i < n; i++) {
            int temp = curr;
            curr = curr + prev;
            prev = temp;
        }

        return curr;
    }
}
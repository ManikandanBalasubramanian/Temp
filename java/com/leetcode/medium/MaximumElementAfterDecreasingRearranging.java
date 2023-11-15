package com.leetcode.medium;

public class MaximumElementAfterDecreasingRearranging {

    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        int prev = 1;
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] > prev) {
                ++prev;
            }
        }
        return prev;
    }
}
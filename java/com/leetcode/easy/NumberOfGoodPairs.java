package com.leetcode.easy;

public class NumberOfGoodPairs {
    public int numIdenticalPairs(int[] nums) {

        int sum = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    sum++;
                }
            }
        }

        return sum;
    }
}
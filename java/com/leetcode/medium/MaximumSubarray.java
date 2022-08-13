package com.leetcode.medium;

public class MaximumSubarray {

    public int maxSubArray(int[] nums) {
        
        int max = Integer.MIN_VALUE, sum = 0;
        
        for(int num : nums) {
            if(num > sum + num) {
                sum = num;
            } else {
                sum += num;
            }
            max = Math.max(sum, max);
        }
        
        return max;
    }
}
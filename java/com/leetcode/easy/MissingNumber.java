package com.leetcode.easy;

public class MissingNumber {

    public int missingNumber(int[] nums) {
        int n = nums.length;
        n = (n * (n+1))/2;
        
        for(int num : nums) {
            n -= num;
        }
        
        return n;
    }
}
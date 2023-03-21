package com.leetcode.medium;

public class NumberOfZeroFilledSubArrays {

    public long zeroFilledSubarray(int[] nums) {
        int i = 0;
        int k = 0;
        long sum = 0;
        while (i < nums.length) {
            if (nums[i] == 0)  {
                sum += k + 1;
                k++;
            }else {
                k=0;
            }
            i++;
        }
        return sum; 
    }
}
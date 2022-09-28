package com.leetcode.medium;

public class SortColors {

    public void sortColors(int[] nums) {
        int[] count = new int[3];
        
        for(int n : nums) count[n] += 1;
        
        for(int i = 0 ; i < nums.length; i++) {
            nums[i] = (i < count[0]) ? 0 : (i < count[0] + count[1]) ? 1 : 2;
        }
    }
}
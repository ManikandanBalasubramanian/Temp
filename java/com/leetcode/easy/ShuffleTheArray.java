package com.leetcode.easy;

public class ShuffleTheArray {
    
    public int[] shuffle(int[] nums, int n) {
        int max = 1001;
        for(int i = n; i < nums.length; i++) {
            nums[i] = max*nums[i]+nums[i-n];
        }
        
        int ind = 0;
        for(int i = n; i < nums.length; i++) {
            nums[ind] = nums[i] % max;
            nums[ind+1] = nums[i] / max;
            ind += 2;
        }
        
        return nums;
    }
}
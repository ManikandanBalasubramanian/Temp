package com.leetcode.medium;

public class HouseRobber {

    public int rob(int[] nums) {

        if(nums.length == 1) return nums[0];
        
        for(int i = 2; i < nums.length; i++) {
            if( i-3 < 0) {
                nums[i] += nums[i-2];
            } else {
                nums[i] += Math.max(nums[i-2], nums[i-3]);                
            }
        }
        
        return Math.max(nums[nums.length-2], nums[nums.length-1]);
    }
}
package com.leetcode.easy;


public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int len = nums.length;
        
        for(int i = 1; i < len; i++) {
           nums[i] = nums[i] + nums[i-1];
        }
        
        if(nums[len-1] - nums[0] == 0) {
            return 0;
        }
        
        for(int i = 1; i < len ; i++) {
            int currentElem = nums[i] - nums[i-1];
            int val = (nums[len-1] - currentElem);
                        
            if(val/2 == nums[i-1] && val %2 ==0) {
                return i;
            }
        }
        
        
        return -1;
    }
}
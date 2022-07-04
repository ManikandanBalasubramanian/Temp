package com.leetcode.easy;

public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        int startIndex = 0;
        
        for(int endIndex = 1; endIndex < nums.length; endIndex++) {
            if(nums [startIndex] != nums[endIndex]) {
                nums[++startIndex] = nums[endIndex];
            }    
        }
        return startIndex + 1;
    }
}
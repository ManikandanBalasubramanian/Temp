package com.leetcode.easy;

public class SearchInsertPosition {

	public int searchInsert(int[] nums, int target) {
        int i = 0;
        for( ; i < nums.length; i++) {
        	if(nums[i] >= target) {
        		return i;
        	}
        }
        return i;
    }
}
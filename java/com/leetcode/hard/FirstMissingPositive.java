package com.leetcode.hard;

public class FirstMissingPositive {

    public int firstMissingPositive(int[] nums) {

		boolean myArr [] = new boolean[300];
	    int index = 1;
	    for(int i = 0; i < nums.length ; i++) {
	        if(nums[i] <= 300 && nums[i] > 0) {
		        myArr[nums[i]-1] = true; 
	        }
	    }

	    for(int i = 0; i < 300; i++ ) {
	        if(!myArr[i]) {
		        index = i+1;
		        break;
	        }
	    }
	    return index;
    }
}
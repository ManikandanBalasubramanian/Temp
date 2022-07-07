package com.leetcode.easy;

import java.util.Arrays;

public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        
        int currIn = 0;
        for(int nextN =0 ; nextN < nums.length; nextN++) {
            if(nums[currIn] != 0) {
                currIn++;
            } else if(nums[nextN] != 0 ) {
                int temp = nums[nextN]; 
                nums[nextN] = nums[currIn];
                nums[currIn] = temp;
                currIn++;
            }            
        }
        
        System.out.println(Arrays.toString(nums));       
    }
	
}
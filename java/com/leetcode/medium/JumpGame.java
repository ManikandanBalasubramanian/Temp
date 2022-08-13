package com.leetcode.medium;

public class JumpGame {

    public boolean canJump(int[] nums) {
        int trueIdx = nums.length-1;
        
        for(int i = nums.length -1; i >=0 ; i--) {
            if((i + nums[i]) >= trueIdx) {
                trueIdx = i;
            }
        }
        
        return trueIdx == 0;
    }
}
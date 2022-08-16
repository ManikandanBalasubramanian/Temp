package com.leetcode.medium;

public class ArithmeticSlices {

    public int numberOfArithmeticSlices(int[] nums) {
        int temp =1, total =0;
        int prevDiff = 3000;
        
        for(int i = 0; i < nums.length -1; i++) {
            int currentDiff =  nums[i + 1] - nums[i];
                        
            if(currentDiff == prevDiff || prevDiff == 3000) {
                temp++;
                if(temp >= 3) total += ((temp-3) + 1);
            } 
            else {
                temp = 2;
            }
            prevDiff = currentDiff;
        }
        
        return total;
    }
}
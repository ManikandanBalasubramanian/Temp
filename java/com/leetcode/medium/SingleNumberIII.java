package com.leetcode.medium;

public class SingleNumberIII {
    
    public int[] singleNumber(int[] nums) {
        int aXorb = 0;
        for(var num : nums) aXorb ^= num;
        int lsDiffBit = (aXorb & (~(aXorb-1)));
        int firstNum = 0, secondNum = 0;
        for(var num : nums){
            if((lsDiffBit & num) != 0){
                firstNum ^= num;
            }else{
                secondNum ^= num;
            }
        } 
        return new int[]{firstNum, secondNum};
    }
}
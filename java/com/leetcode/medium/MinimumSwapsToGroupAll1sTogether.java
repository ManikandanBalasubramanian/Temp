package com.leetcode.medium;


public class MinimumSwapsToGroupAll1sTogether {
    public int minSwaps(int[] nums) {
        int windowSize=0;
        int minimumSwap=0;
        int currentZero=0;
        int n=nums.length;
        for(int num: nums){
          windowSize+=num;
        }
        for(int i=0;i<windowSize;i++){
            if(nums[i]==0)currentZero++;
        }
        int start=0;
        int end=windowSize-1;
        minimumSwap=currentZero;
        while(start<n){
            if(nums[start]==0){
                currentZero--;
            }
            start++;
            end++;
            if(nums[end%n]==0){
                currentZero++;
            }
            minimumSwap=Math.min(minimumSwap,currentZero);
        }
        return minimumSwap;
    }
} 
package com.leetcode.hard;

public class TrappingRainWater {

    public int trap(int[] height) {
        
        int total = 0;
        int start = 0, prev = 0;
        
        for(int i = 0; i < height.length; i++) {

            if(height[i] > prev) total +=  calculate(height, start, i);
            
            if(height[i] >= height[start]) start = i;
        
            prev = height[i];
        }
     
        return total;
    }
    
    public int calculate(int[] height, int start, int end) {
        int min = Math.min(height[start], height[end]);
        int total = 0;
        
        while(start < end) {
            if(height[start] < min) {
                total += (min - height[start]);
                height[start] = min;                
            }
            start++;
        }
        
        
        return total;
    }
}
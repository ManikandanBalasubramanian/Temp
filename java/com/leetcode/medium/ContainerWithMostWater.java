package com.leetcode.medium;

public class ContainerWithMostWater {

	    public int maxArea(int[] height) {
        int start = 0 ;
        int end = height.length -1;
        int max = 0;
        
        while(start < end) {
            int min = 0;
            int len = end-start;
            
            if(height[start] < height[end]) {
                min = height[start++];
            } else {
                min = height[end--];
            }
            max = Math.max(max, min * len);
        } 
        
        return max;
    }
}
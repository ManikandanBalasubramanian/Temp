package com.leetcode.easy;

import java.util.Arrays;

public class HeightChecker {

    public int heightChecker(int[] heights) {
        
        int[] expected = Arrays.copyOf(heights, heights.length);
        Arrays.sort(expected);
        int count = 0;
        
        for(int i = 0 ; i < heights.length; i++) {
            if(heights[i] != expected[i]) count++;
        }
        
        return count;
    }
}
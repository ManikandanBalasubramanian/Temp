package com.leetcode.medium;


public class BestSightSeeingPair {

    public int maxScoreSightseeingPair(int[] values) {
        int maxScore = 0;
        int previous = 0;
        
        for(int i = 0; i < values.length; i++) {
          
            maxScore = Math.max(maxScore, (previous + values[i]));
            previous = Math.max(previous, values[i]) -1;
         
        }
        return maxScore;
    }   
}
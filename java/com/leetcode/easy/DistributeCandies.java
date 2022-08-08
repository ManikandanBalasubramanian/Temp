package com.leetcode.easy;

import java.util.Map;
import java.util.HashMap;

public class DistributeCandies {
    public int distributeCandies(int[] candyType) {
        Map<Integer, Boolean> uniqueCandies = new HashMap<>();
        int index = 0;
        
        for(int i : candyType) {
            if(!uniqueCandies.containsKey(i)) {
                uniqueCandies.put(i, true);
                index++;
            }
        }
        
        return Math.min(index, candyType.length/2);
    }
}
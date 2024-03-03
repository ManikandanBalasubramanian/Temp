package com.leetcode.medium;

import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

public class ReduceArraySizetoHalf {

    public int minSetSize(int[] arr) {
        int count = 0, sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int val : arr) {
            map.put(val, map.getOrDefault(val,0) +1);
        }
        
        Integer[] values = map.values().toArray(new Integer[0]);
        Arrays.sort(values);
        
        for (int i = values.length -1 ; i >= 0 ; i--) {
            sum += values[i];
            count++;
            if (sum >= arr.length/2) return count;
        }
        
        return count;
    }
}
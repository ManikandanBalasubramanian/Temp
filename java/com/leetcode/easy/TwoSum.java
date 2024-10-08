package com.leetcode.easy;

import java.util.Map;
import java.util.HashMap;

class TwoSum {
    
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
     
        for(int i = 0; i < nums.length; i++) {
                if(map.containsKey(nums[i])) {
                    return new int[] {map.get(nums[i]), i};
                }
                map.put(target-nums[i], i);
            }        
        return nums;
    }
}
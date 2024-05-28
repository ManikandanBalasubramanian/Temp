package com.leetcode.easy;

public class SpecialArrayWithXElementsGreaterThanOrEqualToX {
    
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int temp = 0;
        if (nums[nums.length-1] == 0) {
            return -1;
        }
        for (int i = nums.length-1;i>=0;i--) {
            if (count == nums[i]) {
                return -1;
            }
            temp+=1;
            if (temp<=nums[i]) {
                count++;
            }
        }
        return count;
    }
}
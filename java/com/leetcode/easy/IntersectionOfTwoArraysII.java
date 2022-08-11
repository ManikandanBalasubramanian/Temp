package com.leetcode.easy;

import java.util.Arrays;

public class IntersectionOfTwoArraysII {

    public int[] intersect(int[] nums1, int[] nums2) {
        return (nums1.length < nums2.length) ? find (nums1, nums2) : find(nums2, nums1);
    }
    
    public int[] find (int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        
        for(int n: nums1) {
            list.add(n);
        }
        
       return Arrays.stream(nums2).filter(i -> list.remove((Integer) i)).toArray();
    }
}
package com.leetcode.hard;

import java.util.Arrays;

public class MedianofTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        int[] result = new int[l1 + l2];

        System.arraycopy(nums1, 0, result, 0, l1);
        System.arraycopy(nums2, 0, result, l1, l2);
        Arrays.sort(result);
        double output = 0;
        
        if((result.length&1) == 1) {
            output = result[result.length/2];
        } else {
            output = result[result.length/2] + result[(result.length/2) - 1];
            output = output/2;
        }
        
        return output;
    }

}
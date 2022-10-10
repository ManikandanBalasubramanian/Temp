package com.leetcode.easy;

public class MajorityElement {

    public int majorityElement(int[] nums) {
        int n = nums.length;
        int majority_element = 0;

        for (int i = 0; i < 32; i++) {
            int bit = 1 << i;

            int bit_count = 0;
            for (int num : nums) {
                if ((num & bit) != 0) {
                    bit_count++;
                }
            }

            if (bit_count > n / 2) {
                majority_element |= bit;
            }
        }

        return majority_element;
    }
}
package com.leetcode.medium;

public class LongestIncreasingSubsequence {

    public int lengthOfLIS(int[] nums) {

        int pointer = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[pointer]) {
                nums[++pointer] = nums[i];
            } else {
                int index = search(nums, 0, pointer, nums[i]);
                nums[index] = nums[i];
            }
        }
        return ++pointer;
    }

    public int search(int[] a, int low, int high, int target) {

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (a[mid] == target) {
                return mid;
            } else if (a[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}
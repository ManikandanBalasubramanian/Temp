package com.leetcode.medium;

public class FirstAndLastPositionOfElementInSortedArray {

    public int[] searchRange(int[] nums, int target) {
        int[] indices = new int[] { -1, -1 };
        int len = nums.length;

        if (nums == null || nums.length <= 0 || target < nums[0] || target > nums[len - 1])
            return indices;

        if (nums[0] == target && nums[len - 1] == target)
            return new int[] { 0, len - 1 };

        int l1 = 0, r1 = len - 1, m1 = (r1 - l1) / 2 + l1;
        while (l1 <= r1) {
            if (nums[m1] < target) {
                l1 = m1 + 1;
            } else if (nums[m1] > target) {
                r1 = m1 - 1;
            } else if (nums[m1] == target && (m1 > 0 && nums[m1 - 1] == target)) {
                r1 = m1 - 1;
            } else if (nums[m1] == target) {
                indices[0] = m1;
                break;
            }

            m1 = (r1 - l1) / 2 + l1;
        }

        int l2 = 0, r2 = len - 1, m2 = (r2 - l2) / 2 + l2;
        while (l2 <= r2) {
            if (nums[m2] < target) {
                l2 = m2 + 1;
            } else if (nums[m2] > target) {
                r2 = m2 - 1;
            } else if (nums[m2] == target && (m2 < len - 1 && nums[m2 + 1] == target)) {
                l2 = m2 + 1;
            } else if (nums[m2] == target) {
                indices[1] = m2;
                break;
            }

            m2 = (r2 - l2) / 2 + l2;
        }

        return indices;
    }
}
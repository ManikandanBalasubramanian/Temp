package com.leetcode.easy;

public class RemoveElement {

  public int removeElement(int[] nums, int val) {
    int size = nums.length;

    for (int i = nums.length - 1; i >= 0; i--) {

      if (val == nums[i]) {
        for (int j = i; j < size - 1; j++) {
          int temp = nums[j];
          nums[j] = nums[j + 1];
          nums[j + 1] = temp;
        }
        size--;
      }
    }
    return size;
  }
}
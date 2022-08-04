package com.leetcode.easy;

public class RemoveElement {

  public int removeElement(int[] nums, int val) {
    int n = nums.length;
    int swapPointer = -1;
    int index = 0;

    for (int i = 0; i < n; i++) {
      if (swapPointer == -1 && nums[i] == val) {
        swapPointer = i;
        index++;
      } else if (swapPointer != -1 && nums[i] != val) {
        nums[swapPointer++] = nums[i];
      } else if (nums[i] == val) {
        index++;
      }
    }

    return n - index;
  }
}
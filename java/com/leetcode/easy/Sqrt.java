package com.leetcode.easy;

public class Sqrt {
  public int mySqrt(int x) {
    int prev = 1;
    for (int i = 1; i <= x; i++) {

      boolean sqrCheck = i * i < x;
      boolean intOverflow = i * i >= i;

      if (sqrCheck && intOverflow) {
        prev = i;
      } else {
        return prev;
      }
    }

    return prev;
  }
}
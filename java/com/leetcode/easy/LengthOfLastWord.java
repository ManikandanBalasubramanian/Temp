package com.leetcode.easy;


public class LengthOfLastWord {

  public int lengthOfLastWord(String s) {

    char[] arr = s.toCharArray();
    int prevCounter = 0;
    int currentCounter = 0;
    for (char c : arr) {
      if (c == ' ') {
        if (currentCounter != 0) prevCounter = currentCounter;
        currentCounter = 0;
      } else {
        currentCounter++;
      }
    }
    if (currentCounter != 0) prevCounter = currentCounter;
    return prevCounter;
  }
}
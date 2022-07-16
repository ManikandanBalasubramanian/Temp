package com.leetcode.easy;

public class ImplementStrStr {

  public int strStr(String haystack, String needle) {
        
    int nSize = needle.length();
    int hSize = haystack.length();

    for (int i = 0; i < hSize; i++) {
      int pointer = 0;
      int startIndex = -1;

      if (haystack.charAt(i) == needle.charAt(pointer) && (hSize - i) >= (nSize)) {
        startIndex = i;
        int j =i;
        while (pointer++ < nSize - 1 && haystack.charAt(++j) == needle.charAt(pointer)) {}
      }

      if (pointer == nSize) {
        return startIndex;
      }
    }

    return -1;
  }
}
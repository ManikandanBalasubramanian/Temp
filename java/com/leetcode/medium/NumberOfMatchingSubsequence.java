package com.leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberOfMatchingSubsequence {

  public int numMatchingSubseq(String s, String[] words) {
    Map<Character, List<Integer>> map = new HashMap<>();
    int len = s.length();
    int output = 0;

    for (int i = 0; i < len; i++) {
      char sChar = s.charAt(i);
      if (map.containsKey(sChar)) {
        map.get(sChar).add(i);

      } else {
        List<Integer> index = new ArrayList<>();
        index.add(i);
        map.put(sChar, index);
      }
    }

    for (String word : words) {
      char[] wordArr = word.toCharArray();

      int prev = -1;
      int counter = 0;
      for (char wc : wordArr) {
        if (!map.containsKey(wc) || prev == len) {
          break;
        } else {

          for (int i : map.get(wc)) {

            if (i > prev) {
              prev = i;
              counter++;
              break;
            }
          }
        }
      }

      if (counter == word.length()) output++;
    }
    return output;
  }
}

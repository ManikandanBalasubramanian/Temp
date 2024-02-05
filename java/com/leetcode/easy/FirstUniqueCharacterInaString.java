package com.leetcode.easy;

public class FirstUniqueCharacterInaString {
    public int firstUniqChar(String s) {
        int index = -1;
        int count[] = new int[26];

        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 'a'] == 1)
                return i;
        }

        return index;
    }
}
package com.leetcode.easy;

public class RedistributeCharactersToMakeAllStringsEqual {

    public boolean makeEqual(String[] words) {
        Map<Character, Integer> charCount = new HashMap<>();

        for (String word : words) {
            for (char c : word.toCharArray()) {
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }
        }

        int n = words.length;

        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() % n != 0) {
                return false;
            }
        }

        return true;
    }
}
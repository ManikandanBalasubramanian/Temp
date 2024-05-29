package com.leetcode.easy;

import java.util.Map;
import java.util.HashMap;


public class LongestPalindrome {

    public int longestPalindrome(String s) {
        
        Map<Character, Integer> charMap = new HashMap<>();
        int length = 0;
        boolean middle = false;
        
        for(char ch : s.toCharArray()) {
            if(charMap.containsKey(ch)) {
                charMap.put(ch, charMap.get(ch) + 1 );
            } else {
                charMap.put(ch, 1);
            }
        }
        
        for (char ch : charMap.keySet()) {
            int count = charMap.get(ch);
            
            if(count % 2 == 0) {
                length += count;            
            } else if (count > 2) {
                length += (count -1);
                middle = true;
            } else {
                middle = true;
            }
        }
        
        if(middle) length++;
        
        return length;
    }
}
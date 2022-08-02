package com.leetcode.easy;

import java.util.Map;
import java.util.HashMap;

public class WordPattern {

	public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        Map<Character, String> cMap = new HashMap<>();
        Map<String, Character> sMap = new HashMap<>();
        
        if (pattern.length() != words.length) return false;
        
        for(int i = 0; i < words.length; i++) {
            
            if(!cMap.containsKey(pattern.charAt(i)) && !sMap.containsKey(words[i])) {
                cMap.put(pattern.charAt(i), words[i]);
                sMap.put(words[i], pattern.charAt(i));
            }
            
            if(cMap.get(pattern.charAt(i)) == null || !cMap.get(pattern.charAt(i)).equals(words[i])) {
                return false;
            }
        }
        
        return true;
    }
}
package com.leetcode.easy;

import java.util.Map;
import java.util.HashMap;


public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
         
        int sLen = s.length();
        int tLen = t.length();
        
        String sOut = "";
        String tOut = "";
        
        Map<Character, String> sMap = new HashMap<>();
        Map<Character, String> tMap = new HashMap<>();
        
        int pointer = 0;
        boolean output = false;
        
        while(sLen == tLen && pointer < sLen) {
            char sChar = s.charAt(pointer);
            char tChar = t.charAt(pointer);
                        
            if(sMap.containsKey(sChar) && tMap.containsKey(tChar)) {
                sOut += sMap.get(sChar);
                tOut += tMap.get(tChar);
            } else if (!sMap.containsKey(sChar) && !tMap.containsKey(tChar)) {
                sMap.put(sChar, pointer+",");
                tMap.put(tChar, pointer+",");
                sOut += sMap.get(sChar);
                tOut += tMap.get(tChar);
            } else {
                return false;
            }
            
            pointer++;
        }
            
        return sOut.equals(tOut);
    }
}
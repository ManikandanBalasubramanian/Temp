package com.leetcode.medium;

public class AppendCharactersToStringtoMakeSubsequence {
    
    public int appendCharacters(String s, String t) {
        int si = 0;  
        int ti = 0;  

        while (si < s.length() && ti < t.length()) {
            char tChar = t.charAt(ti);  
            char sChar = s.charAt(si);  

            if (sChar == tChar) { 
                si++;  
                ti++;  
            } else {
                si++;  
            }
        }

        return t.length() - ti;
    }
}
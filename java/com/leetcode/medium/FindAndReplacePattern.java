package com.leetcode.medium;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class FindAndReplacePattern {

    public List<String> findAndReplacePattern(String[] words, String pattern) {
        return Arrays.stream(words).filter(w -> isIsomorphic(w,pattern)).collect(Collectors.toList());
    }
    
     
    public boolean isIsomorphic(String s, String t) { 
                
        char[] sCh = new char[26];
        char[] tCh = new char[26];
        
        for(int i = 0 ; i < s.length(); i++) {
      
            if (sCh[s.charAt(i) - 97] == 0 &&  tCh[t.charAt(i) - 97] == 0) {
                sCh[s.charAt(i) - 97] = (char)(t.charAt(i) + 1);
                tCh[t.charAt(i) - 97] = (char)(s.charAt(i) + 1);
                continue;
            } 
            
            if ((char)(t.charAt(i) + 1) != sCh[s.charAt(i) - 97]) {
                return false;
            }
        }
        
        return true;
    }
    
    
}
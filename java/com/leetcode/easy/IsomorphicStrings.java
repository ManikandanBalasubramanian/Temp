package com.leetcode.easy;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
                
        char[] sCh = new char[256];
        char[] tCh = new char[256];
        
        for(int i = 0 ; i < s.length(); i++) {
      
            if (sCh[s.charAt(i)] == 0 &&  tCh[t.charAt(i)] == 0) {
                sCh[s.charAt(i)] = (char)(t.charAt(i) + 1);
                tCh[t.charAt(i)] = (char)(s.charAt(i) + 1);
                continue;
            } 
            
            if ((char)(t.charAt(i) + 1) != sCh[s.charAt(i)]) {
                return false;
            }
        }
        
        return true;
    }
}
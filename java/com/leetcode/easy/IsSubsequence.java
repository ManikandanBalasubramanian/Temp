package com.leetcode.easy;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        
        int sLen = s.length();
        int count = 0;
        int i = 0;
        
        for(String ts : t.split("")) {
            
            if(i < sLen && ts.equals(s.charAt(i)+"" )) {
                count++;
                i++;
            }
        }
        
        return count == sLen;           
    }
}
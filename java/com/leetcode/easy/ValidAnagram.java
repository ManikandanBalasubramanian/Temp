package com.leetcode.easy;


public class ValidAnagram {

	public boolean isAnagram(String s, String t) {
        int [] alpha = new int[26];
        
        for(char c : s.toCharArray()) {
            alpha[c-97]++;
        }
        
        for(char c : t.toCharArray()) {
            --alpha[c-97];
            if(alpha[c-97]<0) {
                return false;
            }
        }
        
        for(int a : alpha) {
            if(a != 0 ) return false;
        }
        
        return true;
    }
}
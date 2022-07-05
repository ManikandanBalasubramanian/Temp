package com.leetcode.easy;

public class ValidPalindrome {
	
	public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]","");
        int i = 0;
        int j = s.length() -1;
        
        while(j > i) {
            if(s.charAt(i++) != s.charAt(j--)) {
                return false;
            }
        }
        
        return true;
    }
}
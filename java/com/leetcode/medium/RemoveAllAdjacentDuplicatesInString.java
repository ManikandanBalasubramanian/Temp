package com.leetcode.medium;

public class RemoveAllAdjacentDuplicatesInString {
	
    public String removeDuplicates(String s) {
        char[] a = S.toCharArray();
        int end = -1;
        for (char c : a) {
            if (end >= 0 && a[end] == c) { 
                --end; 
            }else { 
                a[++end] = c; 
            }
        }
        return String.valueOf(a, 0, end + 1);
    }
}
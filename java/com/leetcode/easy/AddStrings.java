package com.leetcode.easy;

import java.lang.StringBuilder;

public class AddStrings {

    public String addStrings(String n1, String n2) {
        
        StringBuilder output = new StringBuilder();
        int n1L = n1.length() -1;
        int n2L = n2.length() -1;
        int overflow = 0;
        
        while(n1L >= 0 || n2L >= 0) {
            int a = (n1L >= 0)? (n1.charAt(n1L--)-'0') : 0;
            int b = (n2L >= 0)? (n2.charAt(n2L--)-'0') : 0;
            output.append((a+b+overflow)%10);
            overflow = (a+b+overflow)/10;
        }
        
        if(overflow != 0) output.append(overflow);
        
        return output.reverse().toString();
    }
}
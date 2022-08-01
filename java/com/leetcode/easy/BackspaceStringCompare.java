package com.leetcode.easy;

import java.lang.StringBuilder;

public class BackspaceStringCompare {

    public boolean backspaceCompare(String s, String t) {
        int sBackspace = 0;
        int tBackspace = 0;
        StringBuilder sBuilder = new StringBuilder();
        StringBuilder tBuilder = new StringBuilder();
        
        for(int i = s.length()-1; i >= 0; i--) {
            if(s.charAt(i) != '#' && sBackspace == 0) {
                sBuilder.append(s.charAt(i));
            } else if(s.charAt(i) != '#' && sBackspace > 0) {
                sBackspace--;
            } else {
                sBackspace++;
            }
        }
        
         for(int i = t.length()-1; i >= 0; i--) {
            if(t.charAt(i) != '#' && tBackspace == 0) {
                tBuilder.append(t.charAt(i));
            } else if(t.charAt(i) != '#' && tBackspace > 0) {
                tBackspace--;
            } else {
                tBackspace++;
            }
        }
        
        return sBuilder.toString().equals(tBuilder.toString());
        
    }
}
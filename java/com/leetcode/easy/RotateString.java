package com.leetcode.easy;

import java.util.List;
import java.util.ArrayList;

public class RotateString {
    public boolean rotateString(String s, String goal) {
        
        if(s.length() != goal.length()) return false;
        
        char[] sArr = s.toCharArray();
        char[] gArr = goal.toCharArray();
        
        
        List<Integer> index = new ArrayList<>();
        
        for( int i = 0 ; i < s.length(); i++) {
            if(gArr[i] == sArr[0]) index.add(i);
        }
        
        System.out.println(index);
        
        for(int gPointer : index) {
            int sPointer = 0, counter = 0;

            while(sPointer < s.length() && gArr[gPointer++] == sArr[sPointer++]) {
                if(gPointer == s.length()) gPointer = 0;
                
                counter++;
            }
            
            if(counter == s.length()) return true;
        }
        
            
        
        return false;
    }
}
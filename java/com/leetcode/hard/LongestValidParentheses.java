package com.leetcode.hard;

import java.util.ArrayList;
import java.util.List;

public class LongestValidParentheses {

    public int longestValidParentheses(String s) {
        List<Integer> ch = new ArrayList<>();
        
        int pointer = 0, maxLength = 0, current = 0;
        
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if(c == '(') {
                ch.add(i);
                pointer++;
            } else if(pointer > 0) {
                maxLength = Math.max(maxLength, (i - ch.remove(--pointer) + 1));
            } 
        }
           
        return maxLength;
    }
}
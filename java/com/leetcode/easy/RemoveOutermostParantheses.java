package com.leetcode.easy;

import java.util.StringBuilder;

public class RemoveOutermostParantheses {

    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int counter = 0;
        for(char c : S.toCharArray()){
            if(c == '('){
                if(counter != 0) sb.append(c);
                counter++;
            }
            else{
                counter--;
                if(counter != 0) sb.append(c);
            }
        }
        
        return sb.toString();
    }
}
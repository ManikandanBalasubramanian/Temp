package com.leetcode.easy;

import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        
        for(char c : str.toCharArray()) {
            if(c == '(' || c == '[' || c =='{') {
                s.push(c);
            }
            
            if(c == ')' && (s.empty() || s.pop() != '(')) return false;
            if(c == ']' && (s.empty() || s.pop() != '[')) return false;
            if(c == '}' && (s.empty() || s.pop() != '{')) return false;   
        }
        return true && s.empty();
    }	
}
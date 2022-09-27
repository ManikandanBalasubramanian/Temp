package com.leetcode.medium;

import java.util.Stack;
import java.util.StringBuilder;

public class RemoveKDigits {

    public String removeKdigits(String num, int k) {
        if(k >= num.length())
            return "0";
        
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < num.length(); i++){
            char c = num.charAt(i); 
		
            while (!stack.isEmpty() && k > 0 && stack.peek() > c) {
                stack.pop();
                k--;
            }
            stack.push(c);
        }
        
        
        while(!stack.isEmpty() && k > 0){
            stack.pop();
            k--;
        }
        
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        
        sb.reverse(); 
        
        while(sb.length() > 1 && sb.charAt(0) == '0')
            sb.deleteCharAt(0);
        
        return sb.toString();
    }
}
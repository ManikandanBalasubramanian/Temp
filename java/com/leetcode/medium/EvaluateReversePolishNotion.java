package com.leetcode.medium;

import java.util.Stack;

public class EvaluateReversePolishNotion {

    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String s : tokens) {
            if ("+".equals(s)) stack.push(stack.pop() + stack.pop());
            else if ("-".equals(s)) stack.push(-stack.pop() + stack.pop());
            else if ("/".equals(s)) stack.push((int)(1D / stack.pop() * stack.pop()));
            else if ("*".equals(s)) stack.push(stack.pop() * stack.pop());
            else stack.push(Integer.valueOf(s));
        }

        return stack.pop();
    }

}
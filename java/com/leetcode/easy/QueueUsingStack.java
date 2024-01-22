package com.leetcode.easy;

import java.util.Stack;

public class QueueUsingStack {

    Stack<Integer> s = new Stack<>();

    public void push(int x) {
        Stack<Integer> temp = new Stack<>();

        while (!s.empty()) {
            temp.push(s.pop());
        }

        temp.push(x);

        while (!temp.empty()) {
            s.push(temp.pop());
        }
    }

    public int pop() {
        return s.pop();
    }

    public int peek() {
        return s.peek();
    }

    public boolean empty() {
        return s.empty();
    }

}
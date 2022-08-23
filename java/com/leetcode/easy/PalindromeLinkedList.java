package com.leetcode.easy;

import java.uitl.Stack;
import com.leetcode.utils.ListNode;

public class PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {
        ListNode hare = head;
        ListNode tortoise = head;
        boolean odd = true;
        Stack<Integer> stack = new Stack<Integer>();
        
        while(tortoise != null && tortoise.next != null) {
            hare = hare.next;
            if (tortoise.next.next == null) odd = false;
            tortoise = tortoise.next.next;
        }
            
        while(head != hare) {
            stack.push(head.val);
            head = head.next;
        }        
        
        if(odd) hare = hare.next;        

        while(hare != null) {
            if (stack.pop() != hare.val) return false;
            hare = hare.next;
        }
        
        return true;
    }
}
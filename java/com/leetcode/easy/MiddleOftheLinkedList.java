package com.leetcode.easy;

import com.leetcode.utils.ListNode;

public class MiddleOftheLinkedList {
    public ListNode middleNode(ListNode tortoise) {
        ListNode hare = tortoise;
        
        while(hare != null && hare.next != null) {
            hare = hare.next.next;
            tortoise = tortoise.next;
        }
        
        return tortoise;
    }
}
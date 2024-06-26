package com.leetcode.easy;

import com.leetcode.utils.ListNode;

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {

        ListNode prev = null, next = null;
        
        while(head != null) {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        
        return prev;
    }
}
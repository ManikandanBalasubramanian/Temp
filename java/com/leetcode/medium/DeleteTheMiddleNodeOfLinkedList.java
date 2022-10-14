package com.leetcode.medium;

import com.leetcode.utils.ListNode;

public class DeleteTheMiddleNodeOfLinkedList {

    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null) return null;

        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = head;
        
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = slow.next;
        return head;
    }
}
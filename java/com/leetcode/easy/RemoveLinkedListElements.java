package com.leetcode.easy;

import com.leetcode.utils.ListNode;

public class RemoveLinkedListElements {

    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = head;
        ListNode prev = null;
        
        while(temp != null) {
            
           if(temp.val == val) {
               if (prev == null ) {
                 head = temp.next;
               } else {
                 prev.next = temp.next;
               }
           } else {
               prev = temp;
           }
            temp = temp.next;
        }      
        
        return head;
    }
}
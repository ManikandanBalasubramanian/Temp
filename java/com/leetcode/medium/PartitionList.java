package com.leetcode.medium;

import com.leetcode.utils.ListNode;

public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        
        ListNode rightHead = null, leftHead = null, left = null, right = null;
        
        while(head != null) {
            
            if(head.val < x) {                
                if(left == null) {
                    left = head;
                    leftHead = head;
                } else {
                    left.next = head;
                    left = head;
                }
                
            } else {                
                if(right == null) {
                    right = head;
                    rightHead = head;
                } else {
                    right.next = head;
                    right = head;
                }
            }      
            
            head = head.next;
        }
        
        if(right != null) right.next = null;
        
        if(left != null) {
            left.next = rightHead;
        } else {
            leftHead = rightHead;
        }
        
        return leftHead;
    }
}
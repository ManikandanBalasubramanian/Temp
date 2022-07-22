package com.leetcode.medium;

import com.leetcode.utils.ListNode;

public class ReverseLinkedListII {
    public ListNode reverseBetween(ListNode head, int left, int right) {       
        int index = 1;
        ListNode leftStart = null, start = null, temp = head, prev = null, next = null;
                  
        if(left == right) return head;
        
        while(index <= right +1) {
            
            if(index == left-1) {

                leftStart = temp;
                
            } else if(index == right + 1) {
                
                start.next = temp;
                break;
                
            } else if(index == left) {

                prev = temp;
                start = temp;
                
            } else if(index == right) {

                if (leftStart == null) {
                    head = temp;
                } else { 
                    leftStart.next = temp;
                }
                
            } 
            if(index >left && index <= right) {

                next = temp.next;
                temp.next = prev;
                prev = temp;
                temp = next;
                
            } else {
                temp = temp.next;
            }
                
                
            index++;
        }
        return head;
    }
}
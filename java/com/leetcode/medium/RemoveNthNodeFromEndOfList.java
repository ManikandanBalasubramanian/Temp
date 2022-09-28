package com.leetcode.medium;

public class RemoveNthNodeFromEndOfList {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0; 
        ListNode list = head;  
        
        while(list != null) {    
            list = list.next;   
            count++;            
        }
        
        int node = count - n;   

        if( node == 0) return head.next;   

        list = head;            

        while(node-- > 1) list = list.next;
        
        list.next = list.next.next;     

        return head;                    
    }
}
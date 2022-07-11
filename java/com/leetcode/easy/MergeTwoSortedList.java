package com.leetcode.easy;

import com.leetcode.utils.ListNode;

public class MergeTwoSortedList {

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        return rec(l1, l2);        
    }
    
    public ListNode rec(ListNode l1, ListNode l2) {
        ListNode l3 = null;
        if(l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                l3 = l1;
                l3.next = rec(l1.next, l2);
            } else {
                l3 = l2;
                l3.next = rec(l1, l2.next);
            }
        } else if (l1 == null && l2 != null) {
            l3 = l2;
            l3.next = rec(l1, l2.next);
         } else if (l2 == null && l1 != null) {
            l3 = l1;
            l3.next = rec(l1.next, l2);
        }
        return l3;   
    }
}
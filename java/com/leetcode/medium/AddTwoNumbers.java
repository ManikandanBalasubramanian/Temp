package com.leetcode.medium;

import com.leetcode.utils.ListNode;

public class AddTwoNumbers {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int flag = 0;
        ListNode l3 = new ListNode(0),  curr = l3;
        
        while(l1 != null || l2 != null) {  
            int a = l1 == null ? 0 : l1.val;
            int b = l2 == null ? 0 : l2.val;
            curr.next = new ListNode((a + b + flag) % 10);
            flag = (a + b + flag) / 10;
            curr = curr.next;
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null? l2.next : null;
        }
        if (flag > 0) {
            curr.next = new ListNode(flag);
        }
        return l3.next;
    }
}
package com.leetcode.medium;

import com.leetcode.utils.ListNode;

public class SwapNodesInPairs {

	public ListNode swapPairs(ListNode head) {
	    rec(head);
	    return head;
    }
    
    public void rec (ListNode head) {
	    if (head != null && head.next != null) {
	        int oddVal = head.val;
	        head.val = head.next.val;
	        head.next.val = oddVal;
	        rec(head.next.next);
        }
    }
    
}
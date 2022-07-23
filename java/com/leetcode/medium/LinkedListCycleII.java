package com.leetcode.medium;

import com.leetcode.utils.ListNode;
import java.util.Set;
import java.util.HashSet;

public class LinkedListCycleII {

    public ListNode detectCycle(ListNode head) {
        Set<ListNode> refList = new HashSet<>();
        
        while(head != null) {            
            if(refList.contains(head)) {
                return head;
            } else {
                refList.add(head);
            }
            head = head.next;
        }
        return null;
    }
}
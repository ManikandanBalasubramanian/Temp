package com.leetcode.hard;

import com.leetcode.utils.ListNode;
import java.util.ArrayList;
import java.util.List;

public class ReverseNodesInKGroup {
	public ListNode reverseKGroup(ListNode head, int k) {
        if(k == 1) return head;
        List<ListNode> lists = new ArrayList<>();

        while(head != null) {
            lists.add(head);
            head = head.next;
        }

        return rec(lists, 1, k, 0);
    }

    public ListNode rec(List<ListNode> lists, int iteration, int k, int i) {
        if(i !=0 && (i)%k ==0) {
            iteration ++;
        }
        
        if(i == lists.size()) {
            return null;
        }
        
        if((k*iteration) > lists.size()) {
            return lists.get(i);
        }

        int index = ((k*iteration)-i-1) + (k *(iteration-1));
        ListNode output = new ListNode(lists.get(index).val);
        output.next = rec(lists, iteration, k, ++i);

        return output;
    }
}
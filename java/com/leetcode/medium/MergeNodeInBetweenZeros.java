package com.leetcode.medium;

public class MergeNodeInBetweenZeros {
    
    public ListNode mergeNodes(ListNode head) {
        ListNode ans = new ListNode(0);
        ListNode cur = ans;
        ListNode curr = head;
        int sum = 0;
        while(curr != null){
            if(curr.val == 0){
                if(sum != 0){
                    cur.next = new ListNode(sum);
                    cur = cur.next;
                    sum = 0;
                }
            }
            else{
                sum += curr.val;
            }
            curr = curr.next;
        }
        return ans.next;
    }
}
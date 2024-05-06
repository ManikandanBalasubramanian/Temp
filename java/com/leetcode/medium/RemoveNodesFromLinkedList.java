package com.leetcode.medium;

public class RemoveNodesFromLinkedList {
    
    public ListNode removeNodes(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null            ){
            list.add(temp.val);
            temp = temp.next;
        }
        int max = list.get(list.size()-1);
        for(int i=list.size()-2;i>=0;i--){
            if(max<=list.get(i)){
                max = list.get(i);
            }else{
                list.set(i,-1);
            }
        }
        temp = head;
        ListNode prev = null;
        int index = 0;
        while (temp != null) {
            if (list.get(index) == -1) {
                if (prev == null) {
                    head = temp.next;
                } else {
                    prev.next = temp.next;
                }
            } else {
                prev = temp;
            }
            temp = temp.next;
            index++;
        }
        return head;
    }
}
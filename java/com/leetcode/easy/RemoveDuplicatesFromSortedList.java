package com.leetcode.easy;

import com.leetcode.utils.ListNode;

public class RemoveDuplicatesFromSortedList {

  public ListNode deleteDuplicates(ListNode head) {
    ListNode temp = head;
    ListNode prev = null;

    while (temp != null) {
      if (prev != null && temp.val == prev.val) {
        prev.next = temp.next;
      } else {
        prev = temp;
      }
      temp = temp.next;
    }
    return head;
  }
}
package com.leetcode.medium;

public class FindMinimumAndMaximumNumberOfPointsBetweenCriticalPoints {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int max_d = Integer.MAX_VALUE;
        int min_d = Integer.MAX_VALUE;

        int prev = head.val, idx = 0;
        int i = 0;
        while (head.next != null) {
            if ((prev < head.val && head.val > head.next.val) ||
                    (prev > head.val && head.val < head.next.val)) {
                if (idx != 0) {
                    min_d = Math.min(min_d, i - idx);
                }

                max_d = Math.min(max_d, i);
                idx = i;
            }

            prev = head.val; // assign the new previous value
            head = head.next; // move the current node
            i++; // move the current index node
        }

        // edge case
        if (min_d == Integer.MAX_VALUE) {
            return new int[] { -1, -1 };
        }
        max_d = idx - max_d;
        return new int[] { min_d, max_d };
    }
}
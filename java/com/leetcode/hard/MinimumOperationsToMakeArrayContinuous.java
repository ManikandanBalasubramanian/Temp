package com.leetcode.hard;

public class MinimumOperationsToMakeArrayContinuous {

    public int minOperations(int[] nums) {
        Arrays.sort(nums); // Sort the array

        int n = nums.length;
        int maxNumsInWindow = 0;

        Deque<Integer> numsInWindow = new ArrayDeque<>();
        for (int num : nums) {
            while (numsInWindow.size() > 0 && num - numsInWindow.peekFirst() >= n) {
                numsInWindow.poll();
            }

            if (numsInWindow.size() == 0 || !numsInWindow.peekLast().equals(num)) {
                numsInWindow.offer(num);
            }

            maxNumsInWindow = Math.max(maxNumsInWindow, numsInWindow.size());
        }

        return n - maxNumsInWindow;
    }
}
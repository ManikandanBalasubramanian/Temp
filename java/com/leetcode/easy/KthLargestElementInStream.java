package com.leetcode.easy;

public class KthLargestElementInStream {
    
    private final PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    private final int k;    
    public KthLargestElementInStream(int k, int[] nums) {
        this.k = k;
        for (Integer i : nums) {
            minHeap.add(i);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
    }
    
    public int add(int val) {
        minHeap.add(val);
        if (minHeap.size() > k) {
            minHeap.poll();
        }        
        return minHeap.peek();
    }
}
package com.leetcode.easy;

import java.util.PriorityQueue;

public class KthLargestElementInaStream {
    
    PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>();
    int kth;
    
    public KthLargestElementInaStream(int k, int[] nums) {
        kth = k;
        for(int n : nums) {
            maxHeap.offer(n);
        }
        
         while (maxHeap.size() > k) {
            maxHeap.poll();
        }
    }
    
    public int add(int val) {
        maxHeap.offer(val);
        
       if (maxHeap.size() > kth) {
            maxHeap.poll();
        }

        return maxHeap.peek();
    }
}
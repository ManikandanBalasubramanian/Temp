package com.leetcode.medium;

import java.util.PriorityQueue;
import java.util.Collections;

public class RemoveStonesToMinimizeTotal {

    public int minStoneSum(int[] piles, int k) {
        
        PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());
        for(int i:piles) {
            pq.add(i);
        }
        while(!pq.isEmpty() && k-- > 0) {
            int x = pq.poll();
            int a = x - (int)Math.floor(x/2);
            pq.add(a);
        }
        int sum = 0;
        while(!pq.isEmpty()) {
            sum += pq.poll();
        }
        return sum;
    }
}
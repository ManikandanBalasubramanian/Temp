package com.leetcode.medium;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class FindKClosestElements {

   public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int n = arr.length;
        List<Integer> list = new ArrayList<>();

        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a,b) -> ((b.key - a.key) == 0) ? (b.value - a.value) : (b.key - a.key));

        for(int i: arr){
            pq.add(new Pair(Math.abs(i-x), i));

            if(pq.size() > k)
                pq.poll();
        }

        while(pq.size() != 0){
            Pair p = pq.poll();
            list.add(p.value);
        }

        Collections.sort(list);
        return list;
    }
}

class Pair {
    int key, value;
    
    Pair(int k, int val) {
        key = k;
        value = val;
    }
}
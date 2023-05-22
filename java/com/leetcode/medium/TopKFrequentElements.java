package com.leetcode.medium;

public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int n: nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }
           
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = 
                         new PriorityQueue<>((a,b)->(b.getValue()-a.getValue()));
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            maxHeap.add(entry);
        }
        
        int[] res = new int[k];
        int flag = 0;
        while(flag < k) {
            Map.Entry<Integer, Integer> entry = maxHeap.poll();
            res[flag++] = entry.getKey();
        }
        return res;
    }
}
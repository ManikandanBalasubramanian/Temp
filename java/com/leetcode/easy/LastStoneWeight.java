package com.leetcode.easy;

public class LastStoneWeight {

    public int lastStoneWeight(int[] stones) {
        int x = stones.length - 1;
        Arrays.sort(stones);
        
        for(int i = stones.length -2; i >= 0 ; i--) {    
            System.out.println(stones[i] + "<" + stones[x]);
            if(stones[i] < stones[x]) {
                stones[x] = stones[x] - stones[i];
            } else {
                stones[x] = stones[i] - stones[x];
                stones[i] = 0;
            }
        }
        
        return stones[x];
    }
}
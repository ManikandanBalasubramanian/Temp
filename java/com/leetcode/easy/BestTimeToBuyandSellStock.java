package com.leetcode.easy;


public class BestTimeToBuyandSellStock {
    public int maxProfit(int[] prices) {
        int start = 0;
        int max = 0;
        
        for(int end = 0 ; end < prices.length; end++) {
            
            if(prices[start] > prices[end]) {
                start = end;
            }
            max = Math.max(prices[end] - prices[start], max);
        }
        
        return max;
    }
}
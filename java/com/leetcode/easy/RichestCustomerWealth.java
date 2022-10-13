package com.leetcode.easy;

public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        
        for(int[] account : accounts) {
            int sum = 0;
            for(int bal : account) sum += bal;
            
            if(sum >= max) max = sum;
        }
        return max;
    }
}
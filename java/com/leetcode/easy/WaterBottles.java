package com.leetcode.easy;

public class WaterBottles {
    
    public int numWaterBottles(int numBottles, int numExchange) {
        int count=0,emp=0;
        while(numBottles!=0){
            count+=numBottles;
            emp+=numBottles;
            numBottles=emp/numExchange;
            emp %= numExchange;
        }
        return count;
    }
}
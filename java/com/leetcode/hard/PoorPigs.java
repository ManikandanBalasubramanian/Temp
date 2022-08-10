package com.leetcode.hard;

public class PoorPigs {

    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int time = (int)Math.floor(minutesToTest/minutesToDie) + 1;
        int out = (int)Math.floor(Math.log(buckets)/Math.log(time));
        
        double x = Math.log(buckets)/Math.log(time);
        x = (x*1000000);
        x = x/1000000;
        if (x == (int)x) return out;
        
        return out + 1;
    }
}
package com.leetcode.easy;

public class PassThePillow {
    public int passThePillow(int n, int time) {
        if(time>=2*(n-1)){
            time=time%(2*(n-1));
        }
        if(time>=(n-1)){
            time=time-n+1;
            return n-time;
        }
        return time+1;
    }
}
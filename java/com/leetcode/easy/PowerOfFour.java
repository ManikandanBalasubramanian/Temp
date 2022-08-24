package com.leetcode.easy;

public class PowerOfFour {
    public boolean isPowerOfFour(int n) {
        double val = Math.log(n) /Math.log(4);
        return val == (double)(int)val;
    }
}
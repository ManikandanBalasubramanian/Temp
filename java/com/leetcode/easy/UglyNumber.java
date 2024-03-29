package com.leetcode.easy;

public class UglyNumber {

    public boolean isUgly(int num) {
        if (num <= 0) {
            return false;
        }
        
        int[] divisors = {2, 3, 5};
        
        for(int d : divisors) {
            while (num % d == 0) {
                num /= d;
            }
        }
        return num == 1;
    }
}
package com.leetcode.easy;

public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        int count = 0;
                
        while(n > 0) {         
            if (n%2 == 1) {
                count++;
            }
            
            n = n/2;
        }
        return count == 1;
    }
}
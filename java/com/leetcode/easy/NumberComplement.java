package com.leetcode.easy;

public class NumberComplement {
    public int findComplement(int num) {
        int res = 0, n = num, power = 1;

        while (n > 0) {
            int last = n%2;
            res = res + (((last == 0) ? 1: 0)*power);
            n /= 2;
            power *= 2;
        }

        return res;
    }
}
package com.leetcode.hard;

public class CountVowelPermutation {

    public int countVowelPermutation(int n) {

        long u = 1, a = 1, e = 1, i = 1, o = 1;
        int mod = (int) Math.pow(10, 9) + 7;
        int sum = 0;

        while (n-- >= 2) {

            long e1 = a + i;
            long o1 = i + u;
            long i1 = a + e + o + u;

            u = a;
            a = e;

            e = e1 % mod;
            i = i1 % mod;
            o = o1 % mod;
        }

        sum = (int) ((a + e + i + o + u) % mod);
        return sum;
    }
}
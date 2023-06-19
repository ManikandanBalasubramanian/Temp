package com.leetcode.easy;

public class FindTheHighestAltitude {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int sum = 0;
        for (int g : gain) {
            sum += g;

            if (sum > max)
                max = sum;
        }
        return max;
    }
}
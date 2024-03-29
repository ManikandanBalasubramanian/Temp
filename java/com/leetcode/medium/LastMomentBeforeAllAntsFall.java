package com.leetcode.medium;

public class LastMomentBeforeAllAntsFall {

    public int getLastMoment(int n, int[] left, int[] right) {
        int units = 0;
        for (var u : left)
            units = Math.max(units, u);
        for (var u : right)
            units = Math.max(units, n - u);
        return units;
    }
}
package com.leetcode.easy;

public class CountOddNumbersInaRange {
	
    public int countOdds(int low, int high) {
        return high % 2 + low % 2 + (high - low - high % 2 - low % 2) / 2;
    }
}
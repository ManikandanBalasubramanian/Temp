package com.leetcode.easy;

public class SmallestEvenMultiple {
	public int smallestEvenMultiple(int n) {
        return n*(n&1) + n;
    }
}
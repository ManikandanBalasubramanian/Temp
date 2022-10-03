package com.leetcode.easy;

public class SmallestEvenMultiple {
	public int smallestEvenMultiple(int n) {
        return (n&1) == 1 ? n*2 : n;
    }
}
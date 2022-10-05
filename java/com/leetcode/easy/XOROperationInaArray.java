package com.leetcode.easy;

import java.util.Stream;

public class XOROperationInaArray {
    public int xorOperation(int n, int start) {
		return Stream.iterate(0, integer -> integer+1)
				.map(integer ->start+2*integer)
				.limit(n)
				.reduce((a,b)->a^b).orElse(0);
    }
}
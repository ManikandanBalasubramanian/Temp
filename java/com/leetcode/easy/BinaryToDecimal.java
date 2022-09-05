package com.leetcode.easy;



public class BinaryToDecimal {

	public int binary(int n) {
		return binary(n, 1);
	}

	public int binary(int n, int pow) {
		if (n == 0) return 0;
		return (n%10)*pow  + binary(n/10 , pow*2);
	}
}
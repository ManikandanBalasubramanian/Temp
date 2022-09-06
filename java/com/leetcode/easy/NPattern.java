package com.leetcode.easy;


public class NPattern {

	public void pattern(int n) {
		int arr[] = new int[n];
		arr[0] = 1;
		for(int i = 1; i < n; i++) {
			System.out.println();
			int side = 0;
			for(int j = 0 ; j <= i; j++) {
				if(j<=0 || j>i) side = 0;
				arr[j] = arr[j] + side; 
				side = arr[j];
				System.out.print(arr[j]);
			}
		}
	}
}
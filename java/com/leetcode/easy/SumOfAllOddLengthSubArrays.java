package com.leetcode.easy;

public class SumOfAllOddLengthSubArrays {

    public int sumOddLengthSubarrays(int[] arr) { 
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            int allCount = (arr.length - i) * (i + 1);
            int oddCount = allCount % 2 == 0 ? allCount / 2 : allCount / 2 + 1;
            res += oddCount * arr[i];
        }
        return res;
    }
}
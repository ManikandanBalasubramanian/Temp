package com.leetcode.easy;

import java.util.Arrays;

public class MinimumSumOfFourDigitNumber {
    public int minimumSum(int num) {
        int[] digits = new int[4];
        int i = 0;
        
        while(i<4) {
            digits[i++] = num %10;
            num /=10;
        }
        
        Arrays.sort(digits);
        
        return (10*digits[0] + digits[2]) + (10*digits[1] + digits[3]);
    }
}
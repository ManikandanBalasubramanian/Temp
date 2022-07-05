package com.leetcode.easy;


public class PlusOne {
	public int[] plusOne(int[] digits) {
        
        int carry = 1;
        for(int i = digits.length-1 ; i >=0; i--) {
           
            int num = digits[i] + carry;
            carry = num/10;
            num = num %10;
            digits[i] = num;
            
            if(carry == 0) {
                return digits;
            }
        }
        
        int [] newArr = new int[digits.length + 1];
        newArr[0] = 1;
        
        for(int i = 0; i < digits.length; i++) {
            newArr[i + 1] = digits[i];
        }
        
        return newArr;
    }
}
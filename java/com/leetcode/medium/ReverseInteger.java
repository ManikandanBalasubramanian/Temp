package com.leetcode.medium;

public class ReverseInteger {
	public int reverse(int x) {
        int num = 0;
        
        while(x != 0) {
            int digit = x%10;
            x= x/10;
                        
            boolean isLess = (num <= Integer.MAX_VALUE/10) && (num * 10) <= (Integer.MAX_VALUE - digit) ;
            boolean isMore = (num >= Integer.MIN_VALUE/10) && (num * 10) >= (Integer.MIN_VALUE - digit);
                    
            if((num >= 0 && isLess) || (num <= 0 && isMore)) {
                num = num *10 + digit ;
            } else {
                return 0;
            }
        }
        
        return num;
    }
}
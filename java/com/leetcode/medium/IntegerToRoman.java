package com.leetcode.medium;

import java.lang.StringBuilder;

public class IntegerToRoman {

	private final static String[] ROMANS = new String[]{"I","V","X","L","C","D","M"};
    
    public String intToRoman(int num) {
        int curInx = 0;
        StringBuilder sb = new StringBuilder();
        
        while(num != 0) {
            int digit = num %10;
            
            if(digit <= 3) {
                for(int i = 0 ; i < digit; i++) {
                    sb.append(ROMANS[curInx]);
                }
            }
            
            if(digit == 4) {
                sb.append(ROMANS[curInx + 1]);
                sb.append(ROMANS[curInx]);
            }
            
            if(digit >= 5 && digit <= 8) {
                for(int i = 0 ; i < (digit - 5); i++) {
                    sb.append(ROMANS[curInx]);
                }
                sb.append(ROMANS[curInx + 1]);
            }
            
            if(digit == 9) {
                sb.append(ROMANS[curInx + 2]);
                sb.append(ROMANS[curInx]);
            }
            
            num = num/10;
            curInx += 2;
        }
        
        return sb.reverse().toString();
    }
}
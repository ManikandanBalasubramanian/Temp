package com.leetcode.easy;

import java.util.List;
import java.util.LinkedList;

public class AddToArrayFormOfInteger {

	public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list = new LinkedList<>();
        
        int reminder = 0;
        int n = num.length - 1;
        
        while(n >= 0) {
            
            if(k > 0) {
                int lastDigit = k % 10;
                k = k/10;
            
                int sum = reminder + lastDigit + num[n--];
                list.add(0, sum%10);
                reminder = sum/10;
            } else {
                int sum = reminder + num[n--];
                list.add(0, sum%10);
                reminder = sum/10;
            }
        }
        
        while(k > 0) {
            int lastDigit = k % 10;
            k = k/10;
            
            int sum = reminder + lastDigit;
            list.add(0, sum%10);
            reminder = sum/10;
        }
        
        if(reminder > 0) list.add(0, reminder);
        
        
        return list;
    }
}
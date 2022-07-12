package com.leetcode.medium;

import java.util.Set;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class ZigZagConversion {

	public String convert(String s, int numRows) {

	    if((numRows == 1) || s.length() <= numRows) return s;
	        
		Set<Integer> set = new LinkedHashSet<>();
		for(int row = 1; row <= numRows; row++) {
		    int col = 0, index = 0, diff = 0;
		    int topDiff = 2*(row-1);
		    int bottomDiff = 2*(numRows - row);

		    do {
				if(col == 0) {
				    index = row;
				}
				else {
				    index = index + diff;   
				}
				set.add(index - 1); 
				col++;

				if((col&1) == 0) {
				    diff = topDiff;
				} else {
				    diff = bottomDiff;
				}

		    } while(index + diff <= s.length());
		}
		return set.stream().map(i -> s.charAt(i)+"").collect(Collectors.joining());
    }
}
package com.leetcode.medium;

import java.util.Map;
import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {

	public int lengthOfLongestSubstring(String s) {
	    Map<Character, Integer> lastIndexMap = new HashMap<>();
	    int windowStart = 0;
		int maxLength = 0;
	        for(int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
		    
	            if(lastIndexMap.containsKey(s.charAt(windowEnd))) {
	                windowStart = Math.max(lastIndexMap.get(s.charAt(windowEnd)), windowStart);
	            }
	            
	            lastIndexMap.put(s.charAt(windowEnd), windowEnd + 1);
	            maxLength = Math.max(windowEnd-windowStart + 1, maxLength);
	    	}

		return maxLength;
    }
}
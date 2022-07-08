package com.leetcode.medium;

public class LongestPalindromicSubstring {

	public String longestPalindrome(String s) {
	    int windowStart = 0, windowEnd = 1;
        int length = s.length();
	    int maxLength = 0;
	    String palindrome = "";

	    while(windowStart < length) {            
	        if(isPalindrome(s.substring(windowStart, windowEnd))) {
		        if (maxLength < windowEnd-windowStart) {
		            maxLength = windowEnd-windowStart;
		            palindrome = s.substring(windowStart, windowEnd);
		        }    
	        }
	        windowEnd++;

	        if(maxLength == length) {
		        return palindrome;
	        }
	    
	        if((windowStart + maxLength) >= length) {
		        return palindrome;
	        }
            
	        if(windowEnd > length) {
		        windowStart++;
		        windowEnd = windowStart+1;
	        }
	    }

	    return palindrome;
    }
    
    
    
    private boolean isPalindrome(String s) {
		int half = s.length()/2;
		for(int i = 0; i < half; i++)
		{
		    if(s.charAt(i) != s.charAt(s.length()-i-1)) {
				return false;
		    }
		}
		return true;
    }
}
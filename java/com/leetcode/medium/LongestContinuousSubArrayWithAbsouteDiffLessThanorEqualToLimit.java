package com.leetcode.medium;

public class LongestContinuousSubArrayWithAbsouteDiffLessThanorEqualToLimit {
    
    public int longestSubarray(int[] arr, int l) {
        
        int i = 0; int j = 0;
        int ret = 0;
        Deque<Integer> q1 =  new ArrayDeque<>(); //incre
        Deque<Integer> q2 =  new ArrayDeque<>(); //decre
		
        for (; j< arr.length; j++) {
            
            while (!q1.isEmpty() && arr[q1.peekLast()] > arr[j])
                q1.pollLast();
				
            q1.offerLast(j);
            
            while (!q2.isEmpty() && arr[q2.peekLast()] < arr[j])
                q2.pollLast();
				
            q2.offerLast(j);
            
			
            while(arr[q2.peekFirst()] - arr[q1.peekFirst()] > l) {
	
				
                if(q2.peekFirst() == i) q2.pollFirst();
                if(q1.peekFirst() == i) q1.pollFirst();
                
                i++;
            }
            
            ret = Math.max(ret,  j-i+1);
        }
        return ret;
    }
}
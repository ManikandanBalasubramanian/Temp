package com.leetcode.medium;

public class JumpGameII {

    public int jump(int[] nums) {
        int[] bArr = new int[nums.length];
        int n = nums.length;
        int counter = 0;
        
        for(int i = 0; i < n; i++) {
            int index = (nums[i] + i) >= n ? n-1 : (nums[i] + i);
            populate(bArr, i, index);  
        }
                
        while(--n > 0) {
            n = bArr[n]; 
            counter++;
        }

        return counter;
    }
    
    public void populate(int[] bArr, int start, int end) {
        int i = start + 1;
        while (start <= end) {
            
            if(bArr[start] == 0) {
                bArr[start] = i;
            }
            start++;
        }
    }
}
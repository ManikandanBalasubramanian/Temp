package com.leetcode.medium;

public class SumOfEvenNumbersAfterQueries {

    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int sum = 0;
        
        for(int x : nums) if ((x&1) == 0) sum += x;
    
        
        int[] output = new int[queries.length];
        
        for(int i = 0; i < queries.length; i++) {
            
            if((nums[queries[i][1]]&1) == 0) sum -= nums[queries[i][1]];
            nums[queries[i][1]] += queries[i][0];
            
            if((nums[queries[i][1]]&1) == 0) sum += nums[queries[i][1]];

            output[i] = sum;
        }
    
        return output;
    }
}
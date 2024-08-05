package com.leetcode.medium;

public class RangeSumOfSortedSubArraySums 
{
    public int rangeSum(int[] nums, int n, int left, int right) 
    {
        int idx = -1;
        int []array = new int[(n*(n+1))/2];
        for(int i=0; i<n; i++)
        {
            for(int j=i, sum = 0; j<n; j++)
            {
                sum+=nums[j];
                array[++idx] = sum;
            }
        }

        Arrays.sort(array);
        long sum = 0;
        for(int i=left-1; i <= right-1 && i < array.length; i++){
            sum = (sum+array[i])%1000000007;
        }
        return (int)sum;
    }
}
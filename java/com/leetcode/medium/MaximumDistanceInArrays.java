package com.leetcode.medium;

public class MaximumDistanceInArrays {
    
    public int maxDistance(List<List<Integer>> arrays) {
        List<Integer> firstArray = arrays.get(0);
        int min = firstArray.get(0), max = firstArray.get(firstArray.size() - 1), maxDist = Integer.MIN_VALUE;

        for (int i = 1; i < arrays.size(); i++) {
            List<Integer> array = arrays.get(i);
            int currMin = array.get(0);
            int currMax = array.get(array.size() - 1);

            maxDist = Math.max(Math.abs(max - currMin), maxDist);
            maxDist = Math.max(Math.abs(currMax - min), maxDist);

            min = Math.min(currMin, min);
            max = Math.max(currMax, max);
        }

        return maxDist;
    }
}

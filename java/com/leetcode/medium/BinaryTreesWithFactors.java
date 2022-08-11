package com.leetcode.medium;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;


public class BinaryTreesWithFactors {
    public int numFactoredBinaryTrees(int[] arr) {
        Map<Integer, Long> myFactors = new HashMap<>();        
        Arrays.sort(arr);
        long totalSum = 0;
        int mod = (int)Math.pow(10,9) + 7;
        
        for(int i = 0; i < arr.length; i++) {
            long count = 0;
           
            for(int j = 0; j < i; j++) {
                
                if(arr[i] % arr[j] == 0){
                    int k = arr[i]/arr[j];
                  
                    if(k < arr[j]) break;
                    
                    if(myFactors.containsKey(k) && myFactors.containsKey(arr[j])) {
                        
                        if(k != arr[j]) {
                            count += (2*(myFactors.get(k) * myFactors.get(arr[j]))) % mod;
                        } else {
                            count += (myFactors.get(k) * myFactors.get(k)) % mod;
                        }
                    }
                    
                }
            }

            myFactors.put(arr[i], count + 1);
            totalSum = (totalSum + count + 1) % mod;
        }
                
        return (int)totalSum;
    }
}
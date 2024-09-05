package com.leetcode.medium;

public class FindMissingObservations {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int m = rolls.length; 
        int sum = 0; //sum(m)
        for (int ele : rolls) sum += ele;

        int rem = mean * (m + n) - sum; //sum(n)

        if (rem > 6 * n || rem < n) return new int[0]; 

        int dist = rem / n;
        int mod = rem % n;
        int [] res = new int[n];

        for (int i = 0 ; i < n ; i++) res[i] = dist;

        for (int i = 0 ; i < mod ; i++) res[i]++;

        return res;
    }
}
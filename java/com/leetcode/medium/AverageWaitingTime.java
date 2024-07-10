package com.leetcode.medium;

public class AverageWaitingTime {
    
    public double averageWaitingTime(int[][] customers) {
        int n = customers.length;
        long w = customers[0][1],t=(customers[0][0]+customers[0][1]);
        for(int i=1;i<n;i++){
            w+=customers[i][1];
            if(t>customers[i][0]){
                w+=(t-customers[i][0]);
            }
            else if(t<customers[i][0]){
                t+=(customers[i][0]-t);
            }
            t+=customers[i][1];            
        }
        return ((double)w/(double)n);
    }
}
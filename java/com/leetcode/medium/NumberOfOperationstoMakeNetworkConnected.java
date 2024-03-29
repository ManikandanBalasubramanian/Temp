package com.leetcode.medium;

public class NumberOfOperationstoMakeNetworkConnected {

    public int makeConnected(int n, int[][] connections) {
        if (connections.length < n - 1) {
            return -1;
        }
        
        int[] parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
        
        for (int[] connection : connections) {
            int parent1 = findParent(parent, connection[0]);
            int parent2 = findParent(parent, connection[1]);
            if (parent1 != parent2) {
                parent[parent1] = parent2;
            }
        }
        
        int numSets = 0;
        for (int i = 0; i < n; i++) {
            if (parent[i] == i) {
                numSets++;
            }
        }
        return numSets - 1;
    }
    
    private int findParent(int[] parent, int node) {
        if (parent[node] != node) {
            parent[node] = findParent(parent, parent[node]);
        }
        return parent[node];
    }
}
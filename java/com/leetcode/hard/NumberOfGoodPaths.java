package com.leetcode.hard;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class NumberOfGoodPaths {

    int goodPaths = 0;
    
    public int numberOfGoodPaths(int[] vals, int[][] edges) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        
        for (int[] edge : edges) {
            int a = edge[0], b = edge[1];
            
            graph.computeIfAbsent(a, value -> new ArrayList<>()).add(b);
            graph.computeIfAbsent(b, value -> new ArrayList<>()).add(a);
        }
        
        for (int key : graph.keySet()) {
            boolean[] visited = new boolean[vals.length];
            dfs(graph, vals, visited, key, key);
        }
        
        return goodPaths / 2 + vals.length;
    }
    
    private void dfs(Map<Integer, List<Integer>> graph, int[] vals, boolean[] visited, int start, int curr) {
        if (start != curr && vals[start] == vals[curr])
            goodPaths++;
        
        visited[curr] = true;
        
        for (int child : graph.get(curr)) {
            if (!visited[child] && vals[child] <= vals[start])
                dfs(graph, vals, visited, start, child);
        }
    }
}
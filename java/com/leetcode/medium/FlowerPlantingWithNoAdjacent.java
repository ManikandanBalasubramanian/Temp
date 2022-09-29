package com.leetcode.medium;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class FlowerPlantingWithNoAdjacent {
    public int[] gardenNoAdj(int n, int[][] paths) {
        int[] assignedFlower = new int[n];
        
        for(int i = 0; i < Math.min(n, 4); i++) assignedFlower[i] = i + 1;

        if(n <= 4) return assignedFlower;
        
        
        List<Set<Integer>> graph = getGraph(paths, n);
        

        for(int i = 5; i <= n; i++) {            
            if(graph.get(i).size() == 0) assignedFlower[i - 1] = 1;
            else assignedFlower[i - 1] = getUnAssignedFlowerType(graph.get(i), assignedFlower);
        }
        
        return assignedFlower;   
    }
    
    private int getUnAssignedFlowerType(Set<Integer> adjacents, int[] assignedFlower) {        
        boolean[] usedFlowerType = new boolean[5]; 

        for(int adj : adjacents) {
            int flowerType = assignedFlower[adj - 1];
            if(flowerType > 0) usedFlowerType[flowerType] = true;
        }
        
        for(int flowerType = 1; flowerType <= 4; flowerType++) {
            if(!usedFlowerType[flowerType]) return  flowerType;
        }
        
        return 1;
    }
    
    
    private List<Set<Integer>> getGraph(int[][] paths, int n){
        
        List<Set<Integer>> graph = new ArrayList();
        
        for(int i = 0; i <= n; i++){
            graph.add(new HashSet());
        }
        
        for(int[] path : paths){
            graph.get(path[0]).add(path[1]);
            graph.get(path[1]).add(path[0]);
        }
        
        
        return graph;
    }
}
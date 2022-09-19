package com.leetcode.medium;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Collectors;

public class FindDuplicateFileInSystem {

    public List<List<String>> findDuplicate(String[] paths) {
        
        Map<String, List<String>> map = new HashMap<>();
        
        for(String path : paths) {
            String[] parts = path.split(" ");
            String dir = parts[0];
            
            for(int i = 1; i < parts.length; i++) {
                String[] elements = parts[i].split("(\\()");
                if(!map.containsKey(elements[1])) {
                    map.put(elements[1], new ArrayList());
                } 
                    map.get(elements[1]).add(dir+"/" + elements[0]); 
            }
        }
        
        return map.keySet().stream().filter(key -> map.get(key).size() > 1).map(map::get).collect(Collectors.toList());
        
    }
}

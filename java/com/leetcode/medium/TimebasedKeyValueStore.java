package com.leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;

public class TimebasedKeyValueStore {

    HashMap<String, ArrayList<Pair<Integer, String>>> keyTimeMap;
    
    public TimebasedKeyValueStore() {
        keyTimeMap = new HashMap();
    }
    
    public void set(String key, String value, int timestamp) {
        if (!keyTimeMap.containsKey(key)) {
            keyTimeMap.put(key, new ArrayList());
        }
        
        keyTimeMap.get(key).add(new Pair(timestamp, value));
    }
    
    public String get(String key, int timestamp) {
        if (!keyTimeMap.containsKey(key)) {
            return "";
        }
        
        if (timestamp < keyTimeMap.get(key).get(0).getKey()) {
            return "";
        }
        
        int left = 0;
        int right = keyTimeMap.get(key).size();
        
        while (left < right) {
            int mid = (left + right) / 2;
            if (keyTimeMap.get(key).get(mid).getKey() <= timestamp) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        if (right == 0) {
            return "";
        }
                
        return keyTimeMap.get(key).get(right - 1).getValue();
    }
}
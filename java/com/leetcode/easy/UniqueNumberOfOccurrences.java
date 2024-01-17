package com.leetcode.easy;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class UniqueNumberOfOccurrences {

    public boolean uniqueOccurrences(int[] arr) {

        Map<Integer, Integer> count = new HashMap<>();
        for (int a : arr) {
            count.merge(a, 1, Integer::sum);
        }

        Set<Integer> seen = new HashSet<>();
        for (int freq : count.values()) {
            if (!seen.add(freq)) {
                return false;
            }
        }
        return true;
    }
}
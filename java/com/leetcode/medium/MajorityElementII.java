package com.leetcode.medium;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class MajorityElementII {

    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int i : nums) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        int thres = (int) nums.length / 3;

        for (int i : map.keySet()) {
            if (map.get(i) > thres) {
                list.add(i);
            }
        }
        return list;
    }
}
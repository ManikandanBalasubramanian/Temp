package com.leetcode.easy;

import java.util.List;
import java.util.ArrayList;

public class OrderedStream {
    private String[] values;
    private int i = 0;

    public OrderedStream(int n) {
        values = new String[n];
    }

    public List<String> insert(int idKey, String value) {
        values[idKey - 1] = value;   
        List<String> res = new ArrayList<>();
        while (i < values.length && values[i] != null) {
            res.add(values[i]);
            i++;
        }
        return res;
    }
}

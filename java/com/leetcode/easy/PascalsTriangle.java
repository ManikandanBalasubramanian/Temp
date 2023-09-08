package com.leetcode.easy;

import java.util.List;
import java.util.ArrayList;

public class PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> output = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();

            for (int j = 0; j <= i; j++) {

                if (j == 0 || j == i) {
                    list.add(1);
                } else {
                    list.add(output.get(i - 1).get(j) + output.get(i - 1).get(j - 1));
                }
            }

            output.add(list);
        }

        return output;
    }
}
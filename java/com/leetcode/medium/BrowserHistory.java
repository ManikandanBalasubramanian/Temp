package com.leetcode.medium;

import java.util.List;
import java.util.ArrayList;

public class BrowserHistory {
    List<String> list;
    int total = 0;
    int curr = 0;
    public BrowserHistory(String homepage) {
        list = new ArrayList<String>();
        list.add(homepage);
        total++;
        curr++;
    }

    public void visit(String url) {
        if (list.size() > curr) {
            list.set(curr, url);
        } else {
            list.add(url);
        }
        curr++;
        total = curr;
    }

    public String back(int steps) {
        curr = Math.max(1, curr - steps);
        return list.get(curr - 1);
    }

    public String forward(int steps) {
        curr = Math.min(total, curr + steps);
        return list.get(curr - 1);
    }
}
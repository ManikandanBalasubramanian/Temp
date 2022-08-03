package com.leetcode.medium;

import java.util.List;
import java.util.ArrayList;

public class MyCalendar {

    List<Time> cal = new ArrayList<>();
    
    public MyCalendar() {
        
    }
    
    public boolean book(int start, int end) {

        for(Time t : cal) {
            
            if(!t.check(start, end)) {
                return false;
            }
        }
    
         cal.add(new Time(start, end));
        
        return true;
    }
}

class Time {
    int start;
    int end;
    
    Time(int start, int end) {
        this.start = start;
        this.end = end;
    }
    
    public boolean check(int s, int e) {
        return ((s <= start && e <= start) || ( s >= end && e >= end));
    }
    
}
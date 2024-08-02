package com.leetcode.easy;

public class NumberOfSeniorCitizens {
    public int countSeniors(String[] details) {
        return (int) Stream.of(details) // Convert array to Stream
            .map(e -> e.substring(11, 13)) // Extract age substring
            .map(Integer::parseInt) // Convert substring to int
            .filter(age -> age > 60) // Filter ages greater than 60
            .count(); // Count the number of elements that pass the filter
    }
}
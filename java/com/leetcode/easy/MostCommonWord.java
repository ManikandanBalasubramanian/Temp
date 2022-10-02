package com.leetcode.easy;

import java.util.Set;
import java.util.Comparator;
import java.util.Map;
import java.util.Collectors;
import java.util.Function;
import java.util.Arrays;

public class MostCommonWord {
	public String mostCommonWord(String paragraph, String[] banned) {
        String[] words = paragraph
            .toLowerCase()
            .split("[\\p{Punct}\\s]+");
        
         Set<String> bannedWords = Set.of(banned);
        
        return Arrays
            .asList(words)
            .stream()
            .filter(word -> !bannedWords.contains(word))
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
            .entrySet()
            .stream()
            .max(Comparator.comparing(Map.Entry<String, Long>::getValue))
            .get()
            .getKey();
    }
}
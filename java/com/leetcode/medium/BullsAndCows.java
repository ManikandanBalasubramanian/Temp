package com.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class BullsAndCows {
	    public String getHint(String secret, String guess) {
        Map<Character,Integer> characterCount = new HashMap<>();
        
        
        for(int i = 0; i < secret.length(); i++) {
            if(characterCount.containsKey(secret.charAt(i))) {
                characterCount.put(secret.charAt(i), characterCount.get(secret.charAt(i)) + 1);
            } else {
                characterCount.put(secret.charAt(i), 1);
            }
        }
        
        System.out.println(characterCount);
        
        int a = 0;
        int b = 0;
        
        for(int i = 0; i < secret.length(); i++) {
            if(secret.charAt(i) == guess.charAt(i)) {
                a++;
                characterCount.put(guess.charAt(i), characterCount.get(guess.charAt(i)) - 1);
            } 
        }
        
        System.out.println(characterCount);
        
        for(int i = 0; i < secret.length(); i++) {
            
            if(secret.charAt(i) != guess.charAt(i) && characterCount.containsKey(guess.charAt(i)) && characterCount.get(guess.charAt(i)) > 0) {
                b++;
                characterCount.put(guess.charAt(i), characterCount.get(guess.charAt(i)) - 1);
            }
        }
        
        return a+"A"+b+"B";
    }
}
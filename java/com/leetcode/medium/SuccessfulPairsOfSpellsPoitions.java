package com.leetcode.medium;

public class SuccessfulPairsOfSpellsPoitions {

    public int binarySearch(int spell, int[] potions, long success) {
        int startIndex = 0; 
        int lastIndex = potions.length - 1;
        int ansIndex = -1;
        while(startIndex <= lastIndex){
            int midIndex = (startIndex + (lastIndex - startIndex) / 2);
            if ((long) spell * potions[midIndex] >= success){
                ansIndex = midIndex;
                lastIndex = midIndex - 1;
            }
            else{
                startIndex = midIndex + 1;
            }
        }
        return ansIndex;   
    }

    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int m = potions.length;
        int[] ans = new int[spells.length];
        for (int i = 0; i < spells.length; i++) {
            int countPair = 0;
            int index = binarySearch(spells[i], potions, success);
            if (index == -1) 
                countPair += 0;
            else
                countPair += (m - index);
            ans[i] = countPair;
        }
        return ans;
    }
}
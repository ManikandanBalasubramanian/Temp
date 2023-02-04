package com.leetcode.medium;

public class PermutationsInString {

    public static boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) {
            return false;
        }

        int i=0;
        int j=s1.length()-1;
        int[] freqS1 = getCount(s1);
        int[] freqS2 = getCount(s2.substring(0,j));

        while(j<s2.length()) {
            freqS2[s2.charAt(j)-'a']++;
            if(Arrays.equals(freqS1,freqS2)){
                return true;
            }
            freqS2[s2.charAt(i)-'a']--;
            i++;
            j++;
        }
        return false;
    }

    private static int[] getCount(String s){
        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)-'a']++;
        }
        return count;
    }
}
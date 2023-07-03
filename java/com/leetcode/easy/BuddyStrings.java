package com.leetcode.easy;

public class BuddyStrings {

    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length())
            return false;

        int[][] map = new int[2][2];
        int changes = 0;
        boolean atleast = false;

        int[] sFreq = new int[26];
        int[] gFreq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            sFreq[s.charAt(i) - 'a'] += 1;
            gFreq[goal.charAt(i) - 'a'] += 1;

            if (sFreq[s.charAt(i) - 'a'] >= 2)
                atleast = true;

            if (s.charAt(i) != goal.charAt(i)) {
                if (changes >= 2)
                    return false;

                map[0][changes] = goal.charAt(i);
                map[1][changes++] = s.charAt(i);
            }
        }

        if (changes == 0 && !atleast)
            return false;

        if (map[0][0] != map[1][1] || map[0][1] != map[1][0])
            return false;

        for (int i = 0; i < 26; i++)
            if (sFreq[i] != gFreq[i])
                return false;

        return true;
    }
}

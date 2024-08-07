package com.leetcode.medium;

public class MinimumNumberOfPushesToTypeWordII {
    
    public int minimumPushes(String word) {
        int arr[] = new int[26];
        for(int i=0; i<word.length(); i++) {
            arr[word.charAt(i)-'a']++;
        }
        Arrays.sort(arr);
        int count = 0, ans = 0, start = 1;
        for(int i=25; i>=0; i--) {
            if(arr[i] == 0) {
                break;
            }
            ans += start * arr[i];
            count++;
            if(count == 8) {
                start++;
                count = 0;
            }
        }
        return ans;
    }
}
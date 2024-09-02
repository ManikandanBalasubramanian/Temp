package com.leetcode.medium;

public class FindTheStudentThatWillReplaceTheChalk {
    
    public int chalkReplacer(int[] chalk, int k) {
        long sum=0l;
        for(int val:chalk){
            sum+=val;
        }
        sum=(int)(k%sum);
        int ans=0;
        for(int i=0;i<chalk.length;i++){
            if(sum<chalk[i]){
                ans=i;
                break;
            }
            sum-=chalk[i];
        }
        return ans;
    }
}
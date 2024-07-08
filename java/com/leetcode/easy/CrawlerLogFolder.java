package com.leetcode.medium;

public class CrawlerLogFolder {
    
    public int minOperations(String[] logs) {
        Stack <String> stk=new Stack <>();
        System.out.println(logs.length);
        for (int i=0;i<logs.length;i++){
            if (logs[i].equals("../")){
                if (stk.size() > 0){stk.pop();}
                        }
            else if (logs[i].equals("./")){}
            else{   stk.push(logs[i]);}
        }
        return stk.size();
    }
}
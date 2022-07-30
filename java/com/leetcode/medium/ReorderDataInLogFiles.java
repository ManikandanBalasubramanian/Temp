package com.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

import java.lang.StringBuilder;

public class ReorderDataInLogFiles {
	TreeNode root = null;
    int index = 0;
    
    public String[] reorderLogFiles(String[] logs) {
        
        List<String> digiLogs = new ArrayList<>();

        for(String log : logs) {
            String identifier = log.substring(0, log.indexOf(" "));
            String val = log.substring(log.indexOf(" "), log.length());
            
            if(val.matches("^[\\d\\s]+$")) {
                digiLogs.add(log);
            } 
            else {
                
                if(root == null) {
                    root = new TreeNode(val, identifier);
                } else {
                    construct(root, val, identifier);
                }
            }
        }
        
        String[] output = new String[logs.length];
        ascendingList(root, output);

        
        for(String digiLog : digiLogs) {
            output[index++] = digiLog;
        }
        
        return output;
    }
    
    public void construct(TreeNode root, String val, String identifier) {
        int comparison = root.val.compareTo(val);
        
        if( comparison == 0 ) {
            comparison = (root.identifier + root.val).compareTo(identifier + val);
        }
        
        if(comparison <= 0) {
            if(root.right == null) {
                root.right = new TreeNode(val,identifier);
                return;
            } else {
                construct(root.right, val, identifier);
            }
        } else {
            if(root.left == null) {
                root.left = new TreeNode(val,identifier);
                return;
            } else {
                construct(root.left, val, identifier);
            }
        }
    }
    
    
    public void ascendingList(TreeNode root, String[] output) {
        if(root != null) {
            ascendingList(root.left, output);
            output[index++] = root.identifier + root.val;
            ascendingList(root.right, output);
        }
        return;
    }
}


class TreeNode {
     String val;
     String identifier;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
    
     TreeNode(String val,String identifier) { 
         this.val = val; 
         this.identifier = identifier;
     }
    
     TreeNode(String val, String identifier, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
         this.identifier = identifier; 
     }
}
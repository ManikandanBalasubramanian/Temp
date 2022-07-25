package com.leetcode.easy;

import java.util.List;
import java.util.ArrayList;

public class NAryTreePreOrderTraversal {

    List<Integer> output = new ArrayList<>();
    
    public List<Integer> preorder(Node root) {
        if(root != null) output.add(root.val);
        
        while (root!=null && root.children != null && root.children.size() > 0) {
            preorder(root.children.remove(0));       
        } 
        return output;    
        
    }
}


class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
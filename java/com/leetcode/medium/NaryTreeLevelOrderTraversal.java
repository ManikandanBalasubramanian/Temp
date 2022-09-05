package com.leetcode.medium;


import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class NaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(Node root) {
		List<List<Integer>> result = new ArrayList<>();
		if (root == null)
			return result;
		Queue<Node> queue = new LinkedList<>();
		queue.offer(root); 
		while (!queue.isEmpty()) {
			List<Integer> current = new ArrayList<>(); 
			int size = queue.size();
			for (int i=0; i<size; i++) {
				Node temp = queue.poll();
				current.add(temp.val);   
				queue.addAll(temp.children); 
			}
			result.add(current); 
		}
		return result;
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
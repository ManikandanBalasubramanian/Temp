package com.leetcode.easy;

public class NAryTreePostOrderTraversal {
    public List<Integer> postorder(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        if(root==null){
            return list; 
        }
        help(list,root);
        list.add(root.val);
        return list;
    }
    public void help(ArrayList<Integer> list,Node root){
        List<Node> li = new ArrayList<>();
        li = root.children;
        for(int i=0;i<li.size();i++){
            if(li.get(i)==null){
                continue;
            }
            help(list,li.get(i));
            list.add(li.get(i).val);
        }
    }
}
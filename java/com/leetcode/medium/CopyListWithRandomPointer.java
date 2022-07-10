package com.leetcode.medium;

import com.leetcode.utils.Node;
import java.util.List;
import java.util.ArrayList;


public class CopyListWithRandomPointer {

	public Node copyRandomList(Node head) {
        List<Node> nodeList = new ArrayList<>();
        List<Node> nodeList2 = new ArrayList<>();
        
        while(head != null) {
            Node node;
            
            if(!nodeList.contains(head)) {
                node = new Node(head.val);
                nodeList.add(head);
                nodeList2.add(node);
            } else {
                node = nodeList2.get(nodeList.indexOf(head));
            }
            
            if(head.next != null) {
                if(nodeList.contains(head.next)) {
                    node.next = nodeList2.get(nodeList.indexOf(head.next));

                } else {
                    node.next = new Node(head.next.val);
                    nodeList.add(head.next);
                    nodeList2.add(node.next);
                }
            }

                        
            if(head.random != null) {
                if(nodeList.contains(head.random)) {
                    node.random = nodeList2.get(nodeList.indexOf(head.random));

                } else {
                    node.random = new Node(head.random.val);
                    nodeList.add(head.random);
                    nodeList2.add(node.random);
                }
            }
            head = head.next;
        }
        
        return nodeList.size() > 0 ? nodeList2.get(0) : null;
    }

}
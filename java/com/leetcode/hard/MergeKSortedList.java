package com.leetcode.hard;

import com.leetcode.utils.ListNode;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Comparator;

public class MergeKSortedList {

	public ListNode mergeKLists(ListNode[] lists) {
	    lists = Arrays.stream(lists).filter(l -> l != null).toArray(ListNode[]::new);
	    if(lists.length > 0) {
		Arrays.sort(lists, new Sortbyval());
		ListNode out = rec(null, lists, 0);
	    return out;
	    }
	        return null;
    }

    public ListNode rec(ListNode list, ListNode[] lists, int pointerVariable) {
		int minIndex = 0;
		int i, min = Integer.MAX_VALUE;
		boolean isEmpty = true;

		for(i = 0 ; i <= pointerVariable ; i++) {
		    if(lists[i] !=null && lists[i].val < min) {
				min = lists[i].val;
				minIndex = i; 
				isEmpty = false;
		    }
		}
	        
		if(isEmpty) {
		    list = null;
		    return list;
		}
	        
		list =  new ListNode(lists[minIndex].val);
		lists[minIndex] = lists[minIndex].next;

		if (minIndex == pointerVariable && pointerVariable < lists.length-1) {
		    ++pointerVariable;
		}
	         
	    list.next = rec(list.next, lists, pointerVariable);
		return list;
    }
    
    class Sortbyval implements Comparator<ListNode>
    {
        public int compare(ListNode a, ListNode b)
        {
            return a.val - b.val;
        }
    }
}
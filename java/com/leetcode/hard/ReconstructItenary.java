package com.leetcode.hard;

public class ReconstructItenary {

    public List<String> findItinerary(List<List<String>> tickets) {
        LinkedList<String> ret = new LinkedList<String>();
        Map<String, PriorityQueue<String>> map = new HashMap<String, PriorityQueue<String>>();
        Stack<String> stack = new Stack<String>();
        for (List<String> t : tickets) {
            if (!map.containsKey(t.get(0)))
                map.put(t.get(0), new PriorityQueue<String>());
            map.get(t.get(0)).offer(t.get(1));
        }
        stack.push("JFK");
        while (!stack.isEmpty()) {
            String next = stack.peek();
            if (map.containsKey(next) && map.get(next).size() > 0)
                stack.push(map.get(next).poll());
            else
                ret.addFirst(stack.pop());
        }
        return ret;
    }
}
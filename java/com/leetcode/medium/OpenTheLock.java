package com.leetcode.medium;


public class OpenTheLock {
    
    public int openLock(String[] deadends, String target) {
        Set<String> deadSet = new HashSet<>(Arrays.asList(deadends));
        if (deadSet.contains("0000")) return -1; // Check if initial state is a deadend
        
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        queue.offer("0000");
        visited.add("0000");
        
        int depth = 0;
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            
            for (int i = 0; i < size; i++) {
                String current = queue.poll();
                
                if (current.equals(target)) return depth;
                
                for (int j = 0; j < 4; j++) {
                    for (int k = -1; k <= 1; k += 2) {
                        char[] currentArray = current.toCharArray();
                        int digit = (currentArray[j] - '0' + k + 10) % 10; // Handling wrap around
                        
                        currentArray[j] = (char) (digit + '0');
                        String neighbor = new String(currentArray);
                        
                        if (!visited.contains(neighbor) && !deadSet.contains(neighbor)) {
                            queue.offer(neighbor);
                            visited.add(neighbor);
                        }
                    }
                }
            }
            
            depth++;
        }
        
        return -1; // Target not reachable
    }
}
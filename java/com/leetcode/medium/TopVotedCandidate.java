package com.leetcode.medium;

import java.util.List;
import java.util.ArrayList;

class TopVotedCandidate {
    
    List<Node> root = new ArrayList<>();
    
    public TopVotedCandidate(int[] persons, int[] times) {       
        int winner = -1;
        
        Map<Integer, Integer> votePerPerson = new HashMap<>();        
        votePerPerson.put(-1, 0);
        
        for(int i = 0; i < times.length; i++) {
            int p = persons[i];
            if(votePerPerson.getOrDefault(p, 0) + 1 >= votePerPerson.get(winner)) {
                winner = p;
            }
            root.add(new Node(times[i], winner));
            
            votePerPerson.put(p, votePerPerson.getOrDefault(p, 0) + 1);
        }
        

    }
    
    public int q(int t) {
        int lo = 1, hi = root.size();
        while (lo < hi) {
            int mi = lo + (hi - lo) / 2;
            if (root.get(mi).time <= t)
                lo = mi + 1;
            else
                hi = mi;
        }

        return root.get(lo - 1).winner;
    }
        
}


class Node {
    
    int time;
    int winner;
    
    public Node(int time, int winner) {
        this.time = time;
        this.winner = winner;
    }
 
        public String toString() {
        return winner + "( " + time + " ) "; 
    }
}


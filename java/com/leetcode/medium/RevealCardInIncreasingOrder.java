package com.leetcode.medium;

public class RevealCardInIncreasingOrder {
    
    public int[] deckRevealedIncreasing(int[] deck) {
        
        Arrays.sort(deck);
        Queue<Integer> q = new LinkedList();
        for(int i=0;i<deck.length;q.add(i++));

        int ans[] = new int[deck.length];
        int j=0;
        while(!q.isEmpty())
        {
            ans[q.poll()] = deck[j++];
            if(!q.isEmpty())
            {
                q.add(q.peek());
                q.poll();
            }
            
        }
        return ans;
    }
}
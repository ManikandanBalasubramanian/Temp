package com.leetcode.medium;

public class SatisfiabilityOfEqualityEquations {
	int[] id = new int[26];
    int[] size = new int[26];
    
    public boolean equationsPossible(String[] equations) {
    
        for(int i = 0; i < 26; i++) {
			id[i] = i;
			size[i] = 1;
		}
        
        for(String eq : equations) {
            int a = (eq.charAt(0) - 'a');
            int b = (eq.charAt(3) - 'a');
            
            if(eq.charAt(1) == '=') union(a,b);
        }
        
        for(String eq : equations) {
            int a = (eq.charAt(0) - 'a');
            int b = (eq.charAt(3) - 'a');
            
            if(eq.charAt(1) == '!' && connected(a, b)) return false;
        }
        
        return true;
    }
    
    public boolean connected(int p, int q) {
		return root(p) == root(q);
	}
    
    public int root(int i) {
		while(id[i] != i) {
			i = id[i];
		}
		return i;
	}
    
    public void union(int a, int b) {
		int aroot = root(a);
		int broot = root(b);

		if(aroot == broot) return;

		if(size[aroot] > size[broot]) {
			id[broot] = aroot;
			size[aroot] += size[broot];
		} else {
			id[aroot] = broot;
			size[broot] += size[aroot];
		}
	}
}
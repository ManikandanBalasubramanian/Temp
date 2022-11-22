package com.leetcode.medium;

import java.util.Set;
import java.util.HashSet;

public class SetMatrixZeroes {

	public void setZeroes(int[][] matrix) {
	    int R = matrix.length;
	    int C = matrix[0].length;
	    Set<Integer> rows = new HashSet<Integer>();
	    Set<Integer> cols = new HashSet<Integer>();

	    for (int i = 0; i < R; i++) {
	      for (int j = 0; j < C; j++) {
	        if (matrix[i][j] == 0) {
	          rows.add(i);
	          cols.add(j);
	        }
	      }
	    }

	    for (int i = 0; i < R; i++) {
	      for (int j = 0; j < C; j++) {
	        if (rows.contains(i) || cols.contains(j)) {
	          matrix[i][j] = 0;
	        }
	      }
	    }
	}
}
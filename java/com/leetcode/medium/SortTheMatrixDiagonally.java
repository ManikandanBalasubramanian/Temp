package com.leetcode.medium;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class SortTheMatrixDiagonally {
	     public int[][] diagonalSort(int[][] mat) {

	int row = mat.length;
	int col = mat[0].length;

	for(int rindex = 0; rindex < row; rindex++)
	{
	    getDiagonalMatrix(rindex, 0, row, col, mat);
	}
	
	for(int cindex = 1; cindex < col; cindex++)
	{
	    getDiagonalMatrix(0, cindex, row, col, mat);
	}

	return mat;
    }

    public void getDiagonalMatrix(int i, int j, int row, int col, int mat[][])
    {
		int ii =i, jj=j;
		List<Integer> list = new ArrayList<Integer>();
		while (i < row && j < col) {
		    list.add(mat[i][j]);    
		    i++;
		    j++;
		}
		
		Collections.sort(list);
		
		i =ii; j=jj;
		for(int val : list) {
		    mat[i][j] = val;    
		    i++;
		    j++;
		}
    }
}
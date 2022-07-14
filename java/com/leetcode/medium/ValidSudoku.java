package com.leetcode.medium;


public class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {
        
        for(int i = 0; i < 9 ; i++) {
            boolean[] arr = new boolean[9];
            for(int j = 0; j < 9; j++) {
                if(board[i][j] != '.') {
                    if(arr[board[i][j] - 49]){
                        return false;
                    } else {
                        arr[board[i][j] -49] = true;
                    }
                }
            }
        }
    
        for(int i = 0; i < 9 ; i++) {
            boolean[] arr = new boolean[9];
            for(int j = 0; j < 9; j++) {
                if(board[j][i] != '.') {
                    if(arr[board[j][i] - 49]){
                        return false;
                    } else {
                        arr[board[j][i] -49] = true;
                    }
                }
            }
        }
    
    for(int l =0 ; l <9; l+=3) {
        for(int k =0 ; k <9; k+=3) {
            boolean[] arr = new boolean[9];
            for(int i = 0; i < 3 ; i++) {
                for(int j = 0; j < 3; j++) {
                    if(board[i + l][k + j] != '.') {
                        if(arr[board[i + l][k + j] - 49]){
                            return false;
                        } else {
                            arr[board[i + l][k + j] -49] = true;
                        }
                    }
                }
            }
        }
    }
    
        return true;
    }
	
}
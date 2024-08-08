package com.leetcode.medium;

public class SpiralMatrixIII {
    
    class Pair{
        int row;
        int col;
        Pair(int i,int j){
            this.row=i;
            this.col=j;
        }
    }
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        List<Pair> li = new ArrayList<>();
        int r_top = rStart;
        int c_left = cStart;
        int r_bottom = r_top+1;
        int c_right = c_left+1;

        li.add(new Pair(r_top,c_left));
        while(li.size() < rows*cols){
            // Move right
            for(int j = c_left+1;j<=c_right;j++){
                int i = r_top;
                if(i>=0 && i<rows && j>=0 && j<cols) li.add(new Pair(i,j));
            }
            c_left -= 1;
            // Move down
            for(int i = r_top+1;i<=r_bottom;i++){
                int j = c_right;
                if(i>=0 && i<rows && j>=0 && j<cols) li.add(new Pair(i,j));
            }
            r_top -= 1;
            // Move left;
            for(int j = c_right-1;j>=c_left;j--){
                int i = r_bottom;
                if(i>=0 && i<rows && j>=0 && j<cols) li.add(new Pair(i,j));
            }
            c_right += 1;
            // Move up
            for(int i = r_bottom -1;i>=r_top;i--){
                int j = c_left;
                if(i>=0 && i<rows && j>=0 && j<cols) li.add(new Pair(i,j));
            }
            r_bottom += 1;
        }

        int ans[][] = new int[rows*cols][2];
        for(int i=0;i<rows*cols;i++){
            ans[i][0]=li.get(i).row;
            ans[i][1]=li.get(i).col;
        }
        return ans;
    }
}
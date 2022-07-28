package com.leetcode.easy;


public class FloodFill {

   public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] == color) return image;
        return floodFil(image, sr, sc, color, image[sr][sc]);
    }
    
    public int[][] floodFil(int[][] image, int sr, int sc, int color, int prev) {
        
        if(sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length) return image;
        
        if(image[sr][sc] == prev) {
            image[sr][sc] = color;
            floodFil(image, sr +1, sc, color, prev);
            floodFil(image, sr - 1, sc, color, prev);
            floodFil(image, sr, sc + 1, color, prev);
            floodFil(image, sr, sc - 1, color, prev);
        }
        
        return image;
    }   
}
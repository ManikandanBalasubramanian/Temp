package com.leetcode.medium;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.*;


public class SimplifyPath {

   public String simplifyPath(String path) {

        path = path.replaceAll("/\\./","/");
        path = path.replaceAll("//","/");
        
        List<String> paths = Arrays.stream(path.split("/")).collect(Collectors.toList());
        
        for(int i = 0; i < paths.size() ; ) {
            
            if(paths.get(i).equals("")){
                paths.remove(i);
                
            } else if(paths.get(i).equals("..")) {
                paths.remove(i);            
                if(i > 0) {
                    paths.remove(i-1);
                    i--;
                }
            } else if(paths.get(i).equals(".")){
                paths.remove(i);
            } else {
                i++;
            }
        }
        
        path = paths.stream().filter(s-> !s.equals("")).collect(Collectors.joining("/"));
                
        return "/" + path;
    }
}
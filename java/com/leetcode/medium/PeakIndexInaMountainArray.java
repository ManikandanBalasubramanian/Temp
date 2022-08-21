package com.leetcode.medium;

public class PeakIndexInaMountainArray {

    public int peakIndexInMountainArray(int[] arr) {
        int start = 0, end = arr.length -1;
        
        while(start <= end) {
            int mid = start + (end - start)/2;
            
            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]) {
                return mid;
            } else if(arr[mid] < arr[mid-1]) {
                end = mid;
            } else {
                start = mid;
            }
        }
        
        return start;
    }
}
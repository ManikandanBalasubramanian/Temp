package com.leetcode.medium;

import java.util.Arrays;

public class KthLargestElementInanArray {

    public int findKthLargest(int[] nums, int k) {
        MaxHeap m = new MaxHeap();
        int output = 0;
        for(int n : nums) {
            m.add(n);
        }
        
        for(int i = 0 ; i < k ; i++) {
            output = m.poll();
        }
        
        return output;
    }
}

class MaxHeap {
    
    int size = 0;
    int capacity = 10;
    int[] items = new int[capacity];
    
    int getParentIndex(int index) { return (index -1)/2; }
    int getLeftChildIndex(int index) { return (2 * index + 1); }
    int getRightChildIndex(int index) { return (2*index) + 2; }
    
    int parent(int index) { return items[getParentIndex(index)]; }
    int leftChild(int index) { return items[getLeftChildIndex(index)]; }
    int rightChild(int index) { return items[getRightChildIndex(index)]; }
    
    boolean hasParent(int index) { return getParentIndex(index) >= 0;}
    boolean hasLeftChild(int index) { return getLeftChildIndex(index) < size;}
    boolean hasRightChild(int index) { return getRightChildIndex(index) < size;}
    
    void add(int item) {
        ensureCapacity();
        items[size++] = item;
        heapifyDown();
    }
    
    void ensureCapacity() {
        if(size == capacity) {
            capacity *= 2;
            items = Arrays.copyOf(items, capacity);
        }
    }
    
    
    int poll() {
        int item = items[0];
        items[0] = items[size -1];
        size--;
        heapifyUp();
        return item;     
    }
    
    void heapifyUp() {
        int index = 0;
        while(hasLeftChild(index)) {
            int largerIndex = getLeftChildIndex(index);
            if (hasRightChild(index) && rightChild(index) > leftChild(index)) {
                largerIndex = getRightChildIndex(index);
            }
            
            if(items[largerIndex] > items[index]) {
                swap(largerIndex, index);   
                index = largerIndex;
            } else {
                break;
            }
        }
    }
    
    void heapifyDown() {
        int index = size -1;
        while(hasParent(index) && parent(index) < items[index]) {
            int parentIndex = getParentIndex(index);
            swap(parentIndex, index);
            index = parentIndex;
        }
    }
    
    void swap(int index1, int index2) {
		int temp = items[index1];
		items[index1] = items[index2];
		items[index2] = temp;
	}
}
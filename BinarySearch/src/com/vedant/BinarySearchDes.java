package com.vedant;

public class BinarySearchDes {
    public static void main(String[] args) {
        // array must be sorted
        // it is for descending
        int [] arr = {99,89,79,67,64,56,52,50,41,35,26,14,0,-1,-5};
        int target = 79;
        System.out.println(binarysearch(arr,target));

    }
    static int binarysearch(int[]arr , int target){
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = start + (end-start)/2 ;
            if(target < arr[mid]){
                start = mid +1;
            }else if (target > arr[mid]){
                end = mid -1;
            }else{
                return mid;
            }
        }
         return -1;
    }
}

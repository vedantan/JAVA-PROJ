package com.vedant;

public class B1 {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        int target = 6;
        System.out.println(B1(arr,target));

    }
    static int B1 (int [] arr , int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + ((end-start)/2);
            if(target < arr[mid]){
                end = mid-1;
            }
            if(target < arr[mid]){
                start = mid +1;
            }
            else{
              return mid;           }
        }
        return -1;

    }
}

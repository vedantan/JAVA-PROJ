package com.vedant;

import java.util.Arrays;

public class Main {

    // At each iteration, insertion sort removes one element from the input data,
    // finds the location it belongs within the sorted list,
    // and inserts it there.
    public static void main(String[] args) {
        int[] arr ={-3,-6,-1,0,6,7,3,8,9};
        insertationSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertationSort(int[] arr){
//        < symbol is used
        for(int i =0 ; i < arr.length -1 ; i++){
            for(int j =i+1 ; j >0 ; j--){
                if(arr[j] < arr[j-1]){
                    swap(arr, j ,j-1);
                }else{
                    break;
                }
            }
        }
    }

    static void swap(int[]arr , int start ,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}

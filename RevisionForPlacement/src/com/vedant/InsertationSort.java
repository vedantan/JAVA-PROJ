package com.vedant;

import java.util.Arrays;

public class InsertationSort {
    public static void main(String[] args) {
        int[] arr = {5,4,-3,2,1};
        insertation(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void insertation(int[] arr){
        for (int i=0 ; i<arr.length-1 ; i++){
            for(int j=i+1 ; j>0 ; j--){
                if(arr[j] < arr[j-1]){
                    swap(arr,j-1,j);
                }else{
                    break;
                }
            }
        }
    }

    static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

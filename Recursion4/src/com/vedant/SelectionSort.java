package com.vedant;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
       int[] arr= {3,5,7,9};
       Selection(arr, arr.length, 0,0);
        System.out.println(Arrays.toString(arr));
    }
    static void Selection(int[] arr, int r ,int c , int max){
        if(r==0){
            return;
        }
        if(r>c){
            if (arr[c] > arr[max]) {
                Selection(arr,r,c+1,c);
            }else{
                Selection(arr,r,c+1,max);
            }
        }else{
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;
            Selection(arr,r-1,0,0);
        }
    }
}

package com.vedant;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        selection(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void selection(int[] arr){
        for (int i=0 ; i<arr.length ;i++){
            int last = arr.length-i-1;
            int max = getmaxindex(arr , 0, last);

            swap(arr,last,max);
        }
    }

    static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    static int getmaxindex(int[] arr ,int start , int end){
        int max = start;
        for (int i=start ; i<=end ; i++)
        if(arr[max] < arr[i]){
            max = i;
        }
        return max;
    }

}

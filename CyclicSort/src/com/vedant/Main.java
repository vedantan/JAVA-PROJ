package com.vedant;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void cyclicSort(int [] arr){
        int i =0;

        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
    }

     static void swap(int [] arr , int start , int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}

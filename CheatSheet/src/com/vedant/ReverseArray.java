package com.vedant;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,7,9,89,95};
        reverse(arr,0, arr.length-1);
        System.out.println("reverse array is ");
        printArray(arr, arr.length);

    }
    static void reverse(int[] arr , int start ,int end){
        if(start >= end){
            return;
        }
        int temp;
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverse(arr,start+1 , end-1);
    }

    static void printArray(int arr[], int size)
    {
        for (int i=0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }
}

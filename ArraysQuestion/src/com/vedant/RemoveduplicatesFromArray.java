package com.vedant;

import java.util.Arrays;
// only for sorted Array
//https://www.youtube.com/watch?v=QmNsqVi0B8U
//https://www.youtube.com/watch?v=wW5VKfsIMNw

public class RemoveduplicatesFromArray {
    public static void main(String[] args) {
        int[] arr  = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(Arrays.toString(modify(arr)));

        modify2(arr);
    }

    static int[] modify(int[] arr){
        int n = arr.length;
        int[] temp = new int[n];
        int j=0;
        for (int i=0 ; i<n-1 ; i++){
            if(arr[i] != arr[i+1]){
                temp[j] = arr[i];
                j++;
            }
        }
        temp[j] = arr[n-1];

        return temp;
    }

    // no - 2

    static void modify2(int[] arr){
        int n = arr.length;
        int j=0;
        for(int i=0 ; i<n-1 ; i++){
            if(arr[i] != arr[i+1]){
                arr[j] = arr[i];
                j++;
            }
        }
        arr[j] = arr[n-1];

        for (int i=0 ; i<j+1 ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

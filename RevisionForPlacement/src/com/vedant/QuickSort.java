package com.vedant;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int [] arr ={5,4,3,2,1};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr , int low , int high){
        if(low >= high){
            return;
        }
        int s = low;
        int e = high;
        int m = s+(e-s)/2;

        int pivot = arr[m];

        while(s<=e){
            while(arr[s] < pivot){
                s++;
            }
            while(arr[e] > pivot){
                e--;
            }
            // now swapping will take place
            if(s<=e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }

        //now my pivot is at correct index please sort 2 half arrays
        sort(arr,low,e);
        sort(arr,s,high);
    }
}

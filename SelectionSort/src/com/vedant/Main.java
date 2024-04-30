package com.vedant;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int [] arr ={5,4,3,2,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void selectionSort(int[] arr){
        for(int i=0 ; i < arr.length ; i++){
//            find max item in arr and swap with correct arr
            int last = arr.length -i-1;
//            if i=0   , arr.lenght -1 = last
            int max = getmax(arr,0,last);
            swap(arr,max,last);

        }
    }

    static void swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int getmax(int[] arr, int start, int end) {
        int max = start;
        for(int i=start ; i<= end ; i++){
            if(arr[i] > arr[max]){
                max=i;
            }
        }
        return max;
    }
}

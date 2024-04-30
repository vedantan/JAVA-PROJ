package com.vedant;

import java.util.Arrays;

public class MissingValue {

    public static void main(String[] args) {
        int[] arr = {4,0,1,2};

        System.out.println(missingNo(arr));

    }

    static int missingNo(int [] arr){
        int i =0;
//        int correct = arr[i] - 1;
        while(i < arr.length){
            int missing = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[missing]){
                swap(arr,i,missing);
            }else{
                i++;
            }
        }
        for(int index = 0; index < arr.length ; index++){
            if(arr[index] != index){
                return index;
            }
        }
        return arr.length;
    }

    static void swap(int [] arr , int start , int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
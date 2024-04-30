package com.vedant;

import java.util.Arrays;

public class Pakl {
    public static void main(String[] args) {
        int[] arr = {3,0,1,2};
        System.out.println(missingno(arr));
    }
    static int missingno(int[] arr){
        int i=0;
        while (i< arr.length){
            int missing = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[missing]){
                swap(arr , i ,missing);
            }else{
                i++;
            }
        }
        for(int index = 0 ; index < arr.length ;index++){
            if(arr[index] != index){
                return index;
            }
        }
        return arr.length;
    }

    static void swap(int[] arr ,int start ,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }



}
package com.vedant;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {3,1,5,4,2};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void bubbleSort(int [] arr){
        boolean swapped;
//     run the steps n-1
        for(int i= 0 ; i < arr.length-1 ; i++){
            swapped = false;
//            for each step, max item will  come at last index
            for(int j= 1; j< arr.length-i ; j++){
//                swap items smaller than previous item
                if(arr[j] < arr[j-1]){
//                    swap
                    int temp = arr[j];
                    arr[j] =arr [j-1];
                    arr[j-1] = temp;
                    swapped =true;
                }
            }
//            if you did not swap for a particular value of i , it means the array is sorted hence stop the programme
//            if(swapped == false){
//                break;
//            }
        }
    }

}

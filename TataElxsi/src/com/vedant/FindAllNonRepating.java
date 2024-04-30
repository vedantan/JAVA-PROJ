package com.vedant;

import java.util.Arrays;

public class FindAllNonRepating {
    public static void main(String[] args) {
        int[] arr = {1,2,-1,1,3,1};
        nonrepeating(arr);

    }
    static void nonrepeating(int[] arr){
        Arrays.sort(arr);
        for (int i=0 ; i<arr.length ; i++){
            if(arr[i] != arr[i+1]){
                System.out.print(arr[i] + " ");
            }
        }
    }
}

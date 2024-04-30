package com.vedant;

import java.util.Arrays;

public class Median {
    public static void main(String[] args) {
        int[] arr = {2,5,1,7};
        median(arr);

    }
    static void median(int[] arr){
        // for median first we should sort the array
        Arrays.sort(arr);
        int a = arr.length;
        if(a % 2 == 0){
            int b = (a/2) - 1;
            int c = a/2;
            System.out.println(  (double) (arr[b] + arr[c])/2);
        }else {
            System.out.println(arr[a/2]);
        }
    }
}

package com.vedant;

import java.util.Arrays;

public class Median {
    public static void main(String[] args) {
        int[] arr = {2,5,1,7};
        median(arr);

    }

    static void median(int[] arr){
        Arrays.sort(arr);
        int n =arr.length/2 -1;
        if(arr.length % 2 != 0){
            System.out.println(arr[arr.length/2]);
        }else{
            System.out.println( (double) (arr[n] + arr[n+1] ) /2);
        }
    }
}

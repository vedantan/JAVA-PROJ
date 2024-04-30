package com.vedant;

import java.util.Arrays;

public class LargestElementinArray {
    public static void main(String[] args) {
        int arr[] = {8,10,5,7,9};
        System.out.println(largest(arr));
        System.out.println(largest2(arr));
    }

    //  1st method        => time complexity O(N*log(N))
    static int largest(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    // 2nd method        => time complexity O(N)
    static int largest2(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i=0 ;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}

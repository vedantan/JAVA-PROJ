package com.vedant;

import java.util.Arrays;

public class SamllestElementinArray {
    public static void main(String[] args) {
        int arr[] = {8,10,5,7,9};
        System.out.println(smallest(arr));
        System.out.println(smallest2(arr));
    }

    //  1st method        => time complexity O(N*log(N))
    static int smallest(int[] arr){
        Arrays.sort(arr);
        return arr[0];
    }

    // 2nd method        => time complexity O(N)
    static int smallest2(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int i=0 ;i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}

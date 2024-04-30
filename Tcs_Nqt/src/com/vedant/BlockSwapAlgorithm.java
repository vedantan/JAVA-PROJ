package com.vedant;

import java.util.Arrays;

public class BlockSwapAlgorithm {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int k=3;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(algo(arr,k)));
    }

    static int[] algo(int[] arr , int k){
        int[] ans = new int[arr.length];
        int j=0;
        for (int i=k ; i<arr.length ;i++){
            ans[j] = arr[i];
            j++;
        }
        for (int i=0 ; i<k ;i++){
            ans[j] = arr[i];
            j++;
        }
        return ans;
    }
}

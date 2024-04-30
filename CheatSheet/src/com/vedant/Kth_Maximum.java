package com.vedant;

import java.util.Arrays;

public class Kth_Maximum {
    public static void main(String[] args) {
        int [] arr = {3,7,1,5,9,24};

        find(arr,2);
    }
    static void find(int[] arr ,int k){
        Arrays.sort(arr);
        System.out.println(arr[k-1]);
        System.out.println(arr[arr.length-k]);
    }
}

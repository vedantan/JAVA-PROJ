package com.vedant;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] a= {2,5,7,9};
        System.out.println(Arrays.toString(reverse(a)));

    }
//    static int[] rverse(int[] a){
//        int[] nums = new int[a.length];
//        for(int i= a.length -1 ; i>=0 ; i--){
////            nums.length = 4 , i=3
//            nums[nums.length-1-i] = a[i];
//        }
//        return nums;
//    }

    static int[] reverse(int[] arr){
        int[] res = new int[arr.length];
        int j=0;
        for(int i= arr.length-1 ; i>=0 ; i--){
            res[j] = arr[i];
            j++;
        }
        return res;
    }
}

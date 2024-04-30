package com.vedant;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
//        System.out.println(Arrays.toString(reverse(arr)));
       rev2(arr,0,arr.length-1);
      rev2(arr,0,arr.length-1);
    }

    static int[] reverse(int[] arr){
        int[] rev = new int[arr.length];
        int j=0;
        for (int i=arr.length-1 ; i>=0 ; i--){
            rev[j] = arr[i];
            j++;
        }
        return rev;
    }

    static void rev2(int[] rev , int start , int end){
        if(start < end){
            int temp = rev[start];
            rev[start] = rev[end];
            rev[end] = temp;
            rev2(rev,start+1,end-1);
        }
    }
}

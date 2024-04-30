package com.vedant;

public class IsSorted {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,9,8};
        System.out.println(issorted(arr));
    }

//    all testcase passed on gfg

    static boolean issorted(int[] arr){
        for (int i=0 ; i<arr.length-1 ; i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }
}


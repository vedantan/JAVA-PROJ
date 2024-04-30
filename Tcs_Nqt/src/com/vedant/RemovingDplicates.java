package com.vedant;

import java.util.Arrays;

public class RemovingDplicates {
    public static void main(String[] args) {
       int[] arr = {1,1,2,2,2,3,3};
        System.out.println(Arrays.toString(remove(arr)));

    }
    static int[] remove(int[] arr){
        int[] ans = new int[arr.length];
        int j=0;
        for (int i=0 ; i<arr.length-1 ; i++){
            if(arr[i] != arr[i+1]){
                ans[j] = arr[i];
                j++;
            }
        }
        ans[j] = arr[arr.length-1];

        return ans;

    }
}

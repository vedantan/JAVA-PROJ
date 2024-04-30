package com.vedant;

import java.util.Arrays;

public class Sort_AO_DO {
    public static void main(String[] args) {
        int[] arr = {1,4,2,9,7,5,8};
        System.out.println(Arrays.toString(asc_dsc(arr)));
    }

    static int[] asc_dsc(int[] arr){
        int[] ans = new int[arr.length];
        Arrays.sort(arr);
        int mid = arr.length / 2 ;
        int j=0;
        for (int i=0 ; i<mid ; i++){
            ans[j] = arr[i];
            j++;
        }
        for (int i= arr.length-1; i >= mid ; i--){
            ans[j] = arr[i];
            j++;
        }

        return ans;
    }
}

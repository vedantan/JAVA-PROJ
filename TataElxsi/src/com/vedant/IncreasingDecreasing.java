package com.vedant;

import java.util.Arrays;

public class IncreasingDecreasing {
    public static void main(String[] args) {
        int[] arr = {4 ,2, 8, 6, 15, 5, 9, 20};
        System.out.println(Arrays.toString(sol(arr)));
    }

    static int[] sol(int[] arr){
        Arrays.sort(arr);
        int a = arr.length / 2;
        int[] ans = new int[arr.length];
        int j=0;
        for (int i=0 ; i<a ;i++){
            ans[j] = arr[i];
            j++;
        }
        for (int i=arr.length-1 ; i>=a ; i--){
            ans[j] = arr[i];
            j++;
        }
        return ans;
    }
}
//     alternative solution
//    int n = arr.length;
//    Arrays.sort(arr);
//            for (int i = 0; i < n / 2; i++) {
//        System.out.print(arr[i] + " ");
//        }
//        for (int i = n - 1; i >= n / 2; i--) {
//        System.out.print(arr[i] + " ");
//        }
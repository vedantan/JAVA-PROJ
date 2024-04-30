package com.vedant;

public class Average {
    public static void main(String[] args) {
        int[] arr= {1,2,1,1,5,1};
        find(arr);

    }
    static void find(int[] arr){
        int a = arr.length;
        int sum = 0;
        for (int i=0 ; i<arr.length ; i++){
             sum = sum + arr[i];
        }
        int ans = sum/a;
        System.out.println((float) ans);
    }
}

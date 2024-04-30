package com.vedant;

public class SumOfArray {
    public static void main(String[] args) {
        int[] arr = {1,2,1,1,5,1};
        sum(arr);


    }
    static void sum(int[] arr){
        int sum=0;

        for (int i=0 ; i<arr.length ; i++){
             sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}

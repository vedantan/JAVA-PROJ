package com.vedant;

public class SumOfElementsinArray {
    public static void main(String[] args) {
        int[] arr = {1,2,1,1,5,1};
        System.out.println(sum(arr));
    }

    static int sum(int[] arr){
        int sum=0;
        for (int i=0 ; i<arr.length ;i++){
            sum+=  arr[i];
        }
        return sum;


    }
}

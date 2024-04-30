package com.vedant;

import java.util.Arrays;
import java.util.HashSet;

public class MissingNumberArray {
    public static void main(String[] args) {
       int[] arr = {1,2,3,5,10,8,6,0,7,4};
        System.out.println(find(arr, arr.length));
        System.out.println(find2(arr));

    }

    static int find(int[] arr ,int n){
        int total = n*(n+1) /2;
        int sum = 0;
        for(int i =0 ; i< arr.length ; i++){
            sum = sum + arr[i];
        }
        return (total-sum);
    }

    static int find2(int[] arr){
        int sum = 0;
        int sum1 =0 ;
        for(int i=1 ; i<=arr.length ; i++){
            sum = sum +i;
        }

        for(int i=0 ;i< arr.length ; i++){
            sum1 = sum1+arr[i];
        }

        return (sum-sum1);
    }
}

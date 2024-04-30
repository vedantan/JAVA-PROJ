package com.vedant;

public class Stock2 {
    public static void main(String[] args) {
        int [] arr = {6,2,7,3,4,9};
        System.out.println(profit(arr));
    }
    static int profit(int[] arr){
        int profit = 0;
        for(int i=1 ; i< arr.length ; i++){
            if(arr[i] > arr[i-1]){
            profit = profit + arr[i] - arr[i-1];
            }
        }
        return profit;
    }
}

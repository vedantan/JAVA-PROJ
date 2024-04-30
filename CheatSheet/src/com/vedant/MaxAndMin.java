package com.vedant;

public class MaxAndMin {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        maxmin(arr);
    }
    static void maxmin(int[] arr){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
//                System.out.println(max);
            }
            if(arr[i] < min){
                min = arr[i];
//                System.out.println(min);
            }
        }
        System.out.println("Maximum is " + max);
        System.out.println("Minimum is " + min);
    }
}

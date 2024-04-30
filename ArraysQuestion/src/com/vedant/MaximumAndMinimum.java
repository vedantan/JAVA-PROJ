package com.vedant;

public class MaximumAndMinimum {
    public static void main(String[] args) {
        int[] arr = {9,8,7,4,5,-6,1,2,3};
        maxandmin(arr);
    }
    static void maxandmin(int[] arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i=0 ; i<arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }

        }
        System.out.println(max);
        System.out.println(min);

    }
}

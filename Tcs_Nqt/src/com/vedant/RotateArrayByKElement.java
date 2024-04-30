package com.vedant;

import java.util.Arrays;

public class RotateArrayByKElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        Rotateeletoright(arr,7,2);
//        for (int i = 0; i < arr.length; i++)
//            System.out.print(arr[i] + " ");
        System.out.println();


        Rotateeletoright(arr,7,2);
//        for (int i = 0; i < arr.length; i++)
//            System.out.print(arr[i] + " ");

    }

     static void Reverse(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Function to Rotate k elements to right
     static void Rotateeletoright(int[] arr, int n, int k) {
        // Reverse first n-k elements
        Reverse(arr, 0, n - k - 1);
        // Reverse last k elements
        Reverse(arr, n - k, n - 1);
        // Reverse whole array
        Reverse(arr, 0, n - 1);

         for (int i = 0; i < arr.length; i++)
             System.out.print(arr[i] + " ");
    }

    static void RotateToLeft(int[] arr ,int n , int k){
        // Reverse first k elements
        Reverse(arr, 0, k - 1);
        // Reverse last n-k elements
        Reverse(arr, k , n - 1);
        // Reverse whole array
        Reverse(arr, 0, n - 1);

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }


}



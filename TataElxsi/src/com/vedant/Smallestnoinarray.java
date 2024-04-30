package com.vedant;

import java.util.Arrays;

public class Smallestnoinarray {
    public static void main(String[] args) {
        int[] arr =   {1,2,4,7,7,5};
        System.out.println(find(arr));
        find1(arr);
        findmax(arr);
        System.out.println(arr.length);
        System.out.println(secondmin(arr));
        System.out.println(secmax(arr));
    }

    static int find(int[] arr){
        Arrays.sort(arr);
        return arr[0];
    }


    static void find1(int[] arr){
        int min= arr[0];
        for(int i=0 ; i<arr.length-1 ;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }


    static void findmax(int[] arr){
        int max = arr[0];
        for(int i=0 ; i< arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }


   static int secondmin(int[] arr){
        int min = Integer.MAX_VALUE;
        int secmin = Integer.MIN_VALUE;
        for (int i =0 ; i<arr.length ; i++){
            if(arr[i] < min){
                secmin = min;
                min = arr[i];
            }else if(arr[i] < secmin && arr[i] != min){
                secmin = arr[i];
            }
        }
        return secmin;
   }

   static int  secmax(int[] arr){
        int max = Integer.MIN_VALUE;
        int secmax = Integer.MIN_VALUE;
        for (int i=0 ; i< arr.length ; i++){
            if(arr[i] > max){
                secmax = max;
                max = arr[i];
            }else if (arr[i] > secmax && arr[i] != max){
                secmax = arr[i];
            }
        }

        return secmax;
   }
}

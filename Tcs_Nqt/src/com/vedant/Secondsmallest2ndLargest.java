package com.vedant;

public class Secondsmallest2ndLargest {
    public static void main(String[] args) {
        int arr[] = {8,10,5,7,9};
        find(arr);
        second(arr);
    }

    static void find(int[] arr){
        int max = Integer.MIN_VALUE;
        int secmax = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int secmin = Integer.MAX_VALUE;

        for (int i=0 ; i<arr.length ;i++){
            min = Math.min(min,arr[i]);
            max = Math.max(max,arr[i]);
        }

        for(int i=0 ; i<arr.length ;i++){
            if(arr[i] < secmin && arr[i] != min){
                secmin=arr[i];
            }

            if(arr[i] > secmax && arr[i] != max){
                secmax = arr[i];
            }

        }

        System.out.println("the second biggest element is=> "+secmax );
        System.out.println("the second biggest element is=> " + secmin);
    }

    static void second(int[] arr){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int secmax = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int secmin = Integer.MAX_VALUE;
        if(n<2){
            System.out.println(-1);
        }

        for (int i=0 ; i<n ;i++){
            if(arr[i] < min){
                secmin = min;
                min = arr[i];
            }else if(arr[i] < secmin && arr[i] != min ){
                secmin = arr[i];
            }

            if(arr[i] > max){
                secmax = max;
                max=arr[i];
            }else if(arr[i] > secmax && arr[i] != max){
                secmax = arr[i];
            }
        }


        System.out.println(secmin);
        System.out.println(secmax);
    }
}

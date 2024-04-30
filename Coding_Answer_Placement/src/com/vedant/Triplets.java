package com.vedant;

import java.util.Arrays;

public class Triplets {
    public static void main(String[] args) {
        int[] arr = {14,12,23,4,10,7,10,12,9,14,2,14};
        System.out.println(Arrays.toString(findsum(arr)));
        System.out.println(Arrays.toString(finalans(arr)));


    }
    static int[] findsum(int[] arr ){
        int[] c = new int[arr.length/2];
        int j=0;

        for (int i=0 ; i< arr.length ; i=i+2 ){
            c[j] = arr[i] + arr[i+1];
            j++;
        }
        return c;
    }


//    static void isprime(int[] c){
//        for (int i=0 ; i<c.length ; i++){
//            if(c[i] == isprime1(c[i])){
//
//            }
//        }
//
//    }

    static void isprime1(int c){
        for (int i=2 ; i<c ; i++){
            if(c%i != 0){
                return ;
            }
        }
    }


    static void swap(int a ,int b){
        int temp = a;
        a=b;
        b=temp;
    }

    static int[] finalans(int[] a){
        int j=0;
        int[] ans = new int[a.length];
        for (int i=0 ; i<a.length ; i++){
            if(a[i] == isprime1(a[i])){
                swap(a[i] , a[i+1]);
            }
        }
        return ans;
    }

}

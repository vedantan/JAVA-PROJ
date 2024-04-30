package com.vedant;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
        int[] a = {1,2,3,4,5};
        bubble(a);
        System.out.println(Arrays.toString(a));
    }

// for optimization
    static void bubble(int [] a){
        // boolean swapped = false;
        for (int i=0 ; i<a.length-1 ; i++){
            for (int j=0 ; j<a.length-i-1 ; j++ ){
                if(a[j+1] < a[j]){
//                    swapped = true;
                    swap(a,j+1,j);
                }
            }
//            if(!swapped){
//                break;
//            }
        }
    }

    static void swap(int[] a , int i , int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}

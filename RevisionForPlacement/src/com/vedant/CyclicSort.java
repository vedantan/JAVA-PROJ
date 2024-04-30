package com.vedant;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] a = {5,4,3,2,1};
        cyclic(a);
        System.out.println(Arrays.toString(a));
    }

    static void cyclic(int[] a){
        int i=0;
        while(i < a.length){
            int correct = a[i] -1;
            if(a[correct] != a[i]){
                swap(a,i,correct);
            }else{
                i++;
            }
        }
    }

    static void swap(int[] a , int i , int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}



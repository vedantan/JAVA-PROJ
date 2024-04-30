package com.vedant;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] a = {1,0,1,2,0};

    }
    static void find(int[] a){
       for(int i=0 ; i<a.length ;i++){
           if(a[i] > a[i+1]){
               a[i+1] = a[i];
           }
       }

    }
}

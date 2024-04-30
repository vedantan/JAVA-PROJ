package com.vedant;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        reverse(a,0,a.length-1);
        System.out.println(Arrays.toString(a));


    }
    static void reverse(int[] a ,int s ,int e ){
        if(s<e){
            int temp = a[s];
            a[s] = a[e];
            a[e] = temp;
            reverse( a , ++s , --e);
        }





    }
}

package com.vedant;

import java.util.Arrays;

public class FindPositiveMid {
    public static void main(String[] args) {
        int[] a = {11,23,-3,-5,5,0,32};
        System.out.println(Arrays.toString(find(a)));
    }
    static int[] find(int[] a){
        int count =0;
        for (int i=0 ; i<a.length ; i++){
            if(a[i] >= 0){
                count++;
            }
        }

        int[] b = new int[count];
        int j=0;
        for (int i=0 ; i<a.length ; i++){
            if(a[i] >= 0){
                b[j] = a[i];
                j++;
            }
        }

        return b;
//        int s = 0;
//        int e = b.length-1;
//        int mid = (s+e)/2;
//        return b[mid];
    }
}

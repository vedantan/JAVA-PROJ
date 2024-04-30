package com.vedant;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] num1 = {1,3,4,5,6};
        int n1 = num1.length;
        int[] num2 = {1,2,6,7};
        int n2 = num2.length;

        int[] num3 = new int[n1+n2];
        sort(num1,n1,n2,num2,num3);

        for(int i =0 ;i <n1+n2 ;i++){
            System.out.print(num3[i]);
        }


//        System.out.println(mergesort(num1,n1,num2 ,n2));

    }
//
    static int[] sort(int[] num1 , int n1 , int n2 , int[] num2 , int[] num3){
        int i =0 , j=0 ,k=0;
       while( i < n1 && j <n2){
            if (num1[i] < num2[j]) {
                num3[k++] = num1[i++];
            } else {
                num3[k++] = num2[j++];
            }
       }

       if(i < n1){
           num3[k++] = num1[i++];
       }
       if(j < n2){
           num3[k++] = num2[j++];
       }

       return new int[]{};
    }

//    static void mergesort(int[] num1 , int n1 , int[] num2 , int n2  ){
//        for(int i =n1 ; i < n1+n2 ; i++){
//            num1[i] = num2[i-n1];
//        }
//        Arrays.sort(num1);
//    }
}

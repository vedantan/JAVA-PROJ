package com.vedant;

import java.util.Arrays;
import java.util.Collections;

public class ReverseAArray {
    public static void main(String[] args) {
        int[] arr ={5,4,3,2,1};
        System.out.println(Arrays.toString(reverse(arr)));
        System.out.println(Arrays.toString(reverse2(arr)));


    }
    static int[] reverse(int[] arr){
      int[] arr2 = new  int[arr.length];
      int j=0;
      for (int i=arr.length-1 ; i>=0 ;i--){
          arr2[j] = arr[i];
          j++;
      }
      return arr2;
    }

    static int[] reverse2(int[] arr){
        int s = 0;
        int e = arr.length-1;

        while (s<e){
            int temp= arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
        return arr;
    }

    static void reverse3(int[] arr, int s , int e){
        while (s <e){
            int temp= arr[s];
            arr[s] = arr[e];
            arr[e] = temp;

        }
         reverse3(arr,s++,e--);
    }


    static void direct(Integer [] arr){
        Collections.reverse(Arrays.asList(arr));

    }
}

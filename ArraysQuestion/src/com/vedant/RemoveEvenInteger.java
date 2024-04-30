package com.vedant;

import java.util.Arrays;

public class RemoveEvenInteger {
    public static void main(String[] args) {
      int[] arr = {5,2,4,7,8,9,10,0,0,3};
        System.out.println(Arrays.toString(find(arr)));

    }

    static int[] find(int[] arr){
        int oddcount = 0 ;
        for(int i=0 ; i< arr.length ; i++){
            if(arr[i] % 2 != 0 && arr[i] != 0){
                oddcount++ ;
            }
        }

        int[] res = new int[oddcount];
        int id = 0;
        for(int j=0 ; j< arr.length ; j++){
            if(arr[j] % 2 != 0 && arr[j] != 0){
                res[id] = arr[j];
                id++;
            }
        }

        return res;
    }

}

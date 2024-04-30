package com.vedant;

import java.util.Arrays;

public class SingleDigit {
    public static void main(String[] args) {
        int [] arr = {2,1,2,3,3,4,1};

        System.out.println(find(arr));
    }
    static int find(int[] arr){
        if(arr.length ==1){
            return arr[0];
        }

        Arrays.sort(arr); //arr will be sorted so it will return last index
        for(int i =0 ; i < arr.length ; i = i+2){
            if(i == arr.length-1){
                return arr.length -1;
            }
            if(arr[i] != arr[i+1]){
                return arr[i];
            }
        }
        return 0;
    }
}

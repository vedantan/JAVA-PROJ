package com.vedant;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindRepeating {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,4,5,2};
        repeating(arr);

    }
    static void repeating(int[] arr){
        Arrays.sort(arr);
        for (int i=0 ; i<arr.length-1 ; i++){
            if(arr[i] == arr[i+1]){
                System.out.print(arr[i+1] + " ");
            }
        }
    }
}

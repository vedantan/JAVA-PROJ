package com.vedant;

import java.util.Arrays;

public class Main {
//    Arrays.toString() explaination
// Arrays.toString Java. In Java, the Arrays.toString() method is given to convert the array to string.
// Most of the time the toString() method of Arrays class is used to display the array elements
    public static void main(String[] args) {
	   int[] arr = {1,2,3,7,5};
       int target = 12;
        System.out.println(Arrays.toString(find(arr,target)));
    }
    static int[] find(int[] arr , int target){
        for(int i =0 ; i< arr.length ; i++){
            for(int j = i+1 ; j< arr.length ; j++){
                if(arr[j] == target - arr[i]){
                  return new int[]{arr[i],arr[j]};
                }
            }
        }
        return new int[]{-1,-1};
    }
}

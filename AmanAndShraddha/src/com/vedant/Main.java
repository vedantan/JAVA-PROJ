package com.vedant;
import java.util.Arrays;

// question no 1
public class Main {

    public static void main(String[] args) {
	   int[] arr = { 1,3,4,1};
       maxmin(arr);
    }
    static void maxmin(int[] arr){
        Arrays.sort(arr);
        int max = arr[arr.length-1];
        int min = arr[0];

        System.out.println(min+max);
    }
}

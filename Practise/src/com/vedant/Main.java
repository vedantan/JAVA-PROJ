package com.vedant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     int[] arr = {1,2,4,6,8,13,20};
        System.out.println(binary(arr,2));

    }

  static int binary(int [] arr , int target ){
        int s = 0;
        int e = arr.length-1;


        while(s<=e){
            int mid = s + ((e-s)/2);

            if(target < arr[mid] ){
                e = mid-1;
            }
            else if(target > arr[mid] ){
                s = mid+1;
            }
            else{
                return mid;
            }
        }
        return 0;

  }





}
package com.vedant;

import java.util.Scanner;

public class SumInRange {
    public static void main(String[] args) {

        int size = 4;
        int[] arr = {2,3,4,5} ;
        int l = 5;
        int r = 7;

        System.out.println(find(arr,l,r));

    }

    static int find(int[] arr , int l ,int r){
        int count =0;
        for (int i=0 ; i<arr.length ; i++){
            for (int j=i+1 ; j< arr.length ;j++){
                if(arr[i] + arr[j] == l || arr[i] + arr[j] == r ){
                    count++;
                }else if(arr[i] + arr[j] >= l && arr[i]+ arr[j] <=r){
                    count++;
                }
            }
        }

       return count;
    }
}

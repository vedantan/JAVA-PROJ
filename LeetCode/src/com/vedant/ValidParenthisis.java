package com.vedant;

public class ValidParenthisis {
    public static void main(String[] args) {
        int [] arr ={1,1,2};
        System.out.println(isvalid(arr));

    }
    static int[] isvalid(int[] arr){
           for(int i=0 ; i< arr.length ; i++){
               for(int j=i+1 ; j< arr.length ;j++){
                   if(arr[i] == arr[j]){
                       continue;
                   }
                   return new int[] {};
               }
           }
           return new int[] {};
    }
}

package com.vedant;

public class Watertrapping {
    public static void main(String[] args) {
        int[] arr = {3,1,2,4,0,1,3,2};
        System.out.println(water(arr));
    }
    static int water(int[] arr){
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];


        left[0] = arr[0];
        for(int i=1 ; i<arr.length ; i++){
            left[i] = Math.max(left[i-1] , arr[i]);
        }

        right[arr.length - 1] = arr[arr.length-1];
        for(int i=arr.length-2 ; i>=0 ; i--){
            right[i] = Math.max(arr[i],right[i+1]);
        }


        int ans =0 ;
        for(int i=0 ;i< arr.length ; i++){
            ans = ans + Math.min(right[i],left[i]) - arr[i];
        }

        return ans;


    }
}

package com.vedant;

public class MaxiumSubarray {
    public static void main(String[] args) {
        int[] arr = {5,4,-1,7,8};
        System.out.println(max(arr));

    }
    static int max(int[] arr){
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;

        for(int i =0 ; i < arr.length ; i++){
            currsum = currsum + arr[i];
            if(currsum > maxsum){
                maxsum = currsum;
            }if(currsum < 0){
                currsum =0 ;
            }

        }
        return maxsum;
    }
}

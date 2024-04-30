package com.vedant;

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxisub(arr));

    }
    static int maxisub(int[] arr){
        int maxsum = Integer.MIN_VALUE ;
        int currsum =0 ;

        for (int i =0 ; i< arr.length ; i++){
             currsum = currsum + arr[i];
            if(currsum > maxsum){
                maxsum = currsum;
            }if(currsum < 0){
                currsum =0;
            }
        }
        return maxsum;
    }
}

package com.vedant;

public class KadanesAlgorithm {
    public static void main(String[] args) {
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(find(arr));
    }
    static int find(int[] arr){
        int maxsum =Integer.MIN_VALUE;
        int currsum =0;

        for(int i=0 ; i<arr.length ; i++){
            currsum = currsum +arr[i];
            if(currsum > maxsum){
                maxsum = currsum;
            }
            if(currsum < 0){
                currsum = 0;
            }
        }
        return maxsum;
    }
}

package com.vedant;
// Question no 3
public class SubArray {
    public static void main(String[] args) {
        int[] arr = {5,4,-1,7,8};
        System.out.println(kaden(arr));
    }

    static int kaden(int[] arr){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;

        for(int i=0 ; i< arr.length ;i++){
            currsum = currsum + arr[i];
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




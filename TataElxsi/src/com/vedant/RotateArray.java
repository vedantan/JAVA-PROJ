package com.vedant;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k=3;
        System.out.println(Arrays.toString(rot(arr,k)));
    }
    static int[]  rot(int[] arr , int k){
        int[] ans = new int[arr.length];
        int j=0;
      for (int i=k ; i<arr.length ; i++){
          ans[j] = arr[i];
          j++;
      }
      for (int i=0 ; i<k ; i++){
         ans[j] = arr[i];
         j++;
      }

      return ans;
    }
}

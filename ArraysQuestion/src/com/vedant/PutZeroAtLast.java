package com.vedant;

import java.util.Arrays;

public class PutZeroAtLast {
    public static void main(String[] args) {
        int[] arr = {30,0,1,2,-1,4,7,10,0,6,5,0,0,0,1};
        int[] ans = new int[arr.length];
        int j=0;
        for (int i=0 ;i< ans.length ;i++){
            if(arr[i] > 0 || arr[i]<0){
                ans[j] = arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(ans));

    }

//    static void putzero(int[] arr ) {
//
//           int[] ans = new int[arr.length];
//           int j=0;
//           for (int i=0 ;i< ans.length ;i++){
//               if(arr[i] > 0 || arr[i]<0){
//                   ans[j] = arr[i];
//                   j++;
//               }
//           }
//        System.out.println(ans);

}

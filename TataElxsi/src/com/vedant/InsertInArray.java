package com.vedant;

import java.util.Arrays;

public class InsertInArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int k = 5;
        int f = 6;
        int l = 7;
        int m = 100;
        System.out.println(Arrays.toString(modified(arr,k,f)));
        System.out.println(Arrays.toString(modified2(arr,k,l)));
        System.out.println(Arrays.toString(modified3(arr,k,m,3)));

    }

    // insert at first position
    static int[] modified(int[] arr , int k , int f ){
        int[] ans = new int[arr.length+1];
        for (int i= k-1 ; i>=0 ; i--){
            ans[i+1] = arr[i];
        }
        ans[0] = f;
        return ans;
    }

    // insert at last position
    static int[] modified2(int[] arr , int k , int l){
        int[] ans = new int[arr.length + 1];
        int j=0;
        for (int i=0 ; i<arr.length ; i++){
            ans[j] = arr[i];
            j++;
        }
        ans[ans.length-1] = l;
        return ans;
    }

    // insert at specified index
    static int[] modified3(int[] arr , int k ,int m , int insert){
        int[] ans = new int[arr.length + 1];
        int j=0;
        for (int i=0 ; i<insert ; i++){
            ans[j] = arr[i];
            j++;
        }
        ans[j] = m;
        j++;
        for (int i=insert; i<arr.length ; i++){
            ans[j] = arr[i];
            j++;
        }
        return ans;
    }

}

package com.vedant;

import java.util.Arrays;
// tejas
public class FindOriginalArray {
    public static void main(String[] args) {
        int[] arr = {14,16,17,19};
        int n = 4;
        System.out.println(Arrays.toString(original(arr,n)));
    }

    static int[] original(int[] a , int n){
        int sum = 0;
        int[] ans = new int[a.length];
        for (int i=0 ; i< a.length ;i++){
            sum = sum + a[i];
        }

        sum = sum/(n+1);
        int j=0;
        for (int i=0 ; i< a.length ; i++){
            ans[j] = a[i] - sum;
            j++;
        }

        return ans;
    }
}

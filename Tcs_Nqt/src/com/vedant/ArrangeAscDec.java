package com.vedant;

import java.util.Arrays;

public class ArrangeAscDec {
    public static void main(String[] args) {
        int[] arr = {4 ,2 ,8 ,6 ,15 ,5 ,9 ,20};
        System.out.println(Arrays.toString(rearrange(arr)));
    }

    static int[] rearrange(int[] arr){
        int[] ans = new int[arr.length];
        int j=0;
        Arrays.sort(arr);
        for (int i=0 ; i<arr.length/2 ;i++){
            System.out.print(arr[i] + " ");
            ans[j] = arr[i];
            j++;
        }
        for (int i=arr.length -1 ; i>=arr.length/2 ; i--){
            System.out.print(arr[i] + " ");
            ans[j] = arr[i];
            j++;
        }
        System.out.println();
        return ans;
    }
}

package com.vedant;
// Question no 5
import java.util.Arrays;

public class ChocolateDistrubation {
    public static void main(String[] args) {
        int[] arr= {3, 4, 1, 9, 56, 7, 9, 12};
        System.out.println(find(arr,5, arr.length));

    }
       static int find(int[] arr ,int n , int m){
        Arrays.sort(arr);
        int ans = Integer.MAX_VALUE;
        for(int i=0 ; i+n-1 < m  ; i++){
            ans = Math.min(arr[i+n-1] - arr[i], ans);

        }
        return ans;
    }
}

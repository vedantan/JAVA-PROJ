package com.vedant;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,3};
        System.out.println(Arrays.toString(remove(arr)));

    }
    static int[] remove(int[] arr){
        Arrays.sort(arr);
        int count = 0;
        for (int i=0 ; i<arr.length-1 ; i++){
            if(arr[i] == arr[i+1]){
                count++;
            }
        }
        int[] ans = new int[count];
        int j=0 ;
//        for (int i=0 ; i<arr.length ; i++) {
//            Map map = new HashMap<>();
//            map.put(arr[i])
//
//        }

        return ans;

    }
}

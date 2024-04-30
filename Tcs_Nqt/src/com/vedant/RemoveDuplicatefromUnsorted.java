package com.vedant;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class RemoveDuplicatefromUnsorted {
    public static void main(String[] args) {
        int[] arr ={2,3,1,9,3,1,3,9};
        System.out.println(Arrays.toString(find(arr)));
    }

    static int[] find(int[] arr){
        HashMap<Integer, Integer> mp = new HashMap<>();
        int[] ans = new int[arr.length];
        int j=0;
        for (int i = 0; i < arr.length; i++) {
            if (!mp.containsKey(arr[i])) {
                ans[j] = arr[i];
                j++;
                mp.put(arr[i], 1);
            }
        }
        return ans;
    }
}

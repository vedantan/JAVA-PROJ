package com.vedant;

import java.util.Arrays;
import java.util.HashMap;

public class SortElementsofArrayFrequency {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,4,3,1,2};
        System.out.print(Arrays.toString(sortElement(arr)));

    }

    static int[] sortElement(int[] arr){
        int j=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] ans = new int[arr.length];
        for (int i=0 ; i<arr.length ; i++){
            if(map.containsKey(arr[i] )){
                map.put(arr[i] , map.get(arr[i])+1);
            }else{
                map.put(arr[i] , 1);
            }
        }

        System.out.println(map);
        for (int i=0 ; i<arr.length ;i++){
            ans[j] = Math.max(arr[i] , map.get(arr[i]));
            j++;
        }

        return ans;
    }
}

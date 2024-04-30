package com.vedant;

import java.util.HashMap;

public class CountFrequency {
    public static void main(String[] args) {
        int arr[] = {2,2,3,4,4,2};
        findoccurances(arr);
    }
    static void findoccurances(int[] arr){
        HashMap<Integer , Integer> map = new HashMap<>();
        for (int i=0 ; i<arr.length ; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i] , map.get(arr[i])+1 );
            } else{
                map.put(arr[i] , 1);
            }
        }

        for (HashMap.Entry<Integer,Integer> entry : map.entrySet())
        {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


    }
}

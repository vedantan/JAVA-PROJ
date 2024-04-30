package com.vedant;

import java.util.HashMap;
import java.util.Map;

public class CountEachOccurance {
    public static void main(String[] args) {
        int[] arr= {10,5,10,15,10,5};
        counteachoccurance(arr);

    }

    static void counteachoccurance(int[] arr){
        HashMap<Integer , Integer> mp = new HashMap<>();
        for (int i=0 ; i<arr.length ; i++){
            if(mp.containsKey(arr[i])){
                mp.put(arr[i]  , mp.get(arr[i])+1);
            }else{
                mp.put(arr[i] , 1);
            }
        }

        for (Map.Entry<Integer,Integer> entry : mp.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


    }
}

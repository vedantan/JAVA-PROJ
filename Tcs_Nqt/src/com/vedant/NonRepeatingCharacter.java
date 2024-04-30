package com.vedant;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatingCharacter {
    public static void main(String[] args) {
        int[] arr = {1,2,-1,1,3,1};
        nonrep(arr);
    }

    static void nonrep(int[] arr){
        HashMap<Integer ,Integer> map = new HashMap<>();
        for (int i=0 ; i<arr.length ; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i] , map.get(arr[i])+1);
            }else{
                map.put(arr[i] , 1);
            }
        }

        System.out.println(map);
        for(HashMap.Entry<Integer,Integer> entry: map.entrySet()) {
            if(entry.getValue()==1)
                System.out.print(entry.getKey()+" ");
        }
    }
}

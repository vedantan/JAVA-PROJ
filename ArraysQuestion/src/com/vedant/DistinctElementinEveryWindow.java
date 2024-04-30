package com.vedant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class DistinctElementinEveryWindow {
    public static void main(String[] args) {
        int a[] = {1, 2, 1, 3, 4, 2, 3};
        int k = 4;

        System.out.println(find(a,k));
    }
    static ArrayList find(int[] a , int k){
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer ,Integer> map = new HashMap<>();

        for(int i= 0 ; i<k ; i++){
            map.put(a[i] , map.getOrDefault(a[i],0)+1);
        }
        list.add(map.size());

        for(int i =k ; i<a.length ; i++){
            if(map.get(a[i-k] ) == 1){
                map.remove(a[i-k]);
            } else{
                map.put(a[i-k] , map.get(a[i-k]) - 1);
            }

            map.put(a[i] , map.getOrDefault(a[i] , 0) +1);
            list.add(map.size());
        }
                return list;
    }
}

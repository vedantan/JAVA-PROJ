package com.vedant;

import java.util.HashSet;
import java.util.Set;

public class CountDistinctNo {
    public static void main(String[] args) {
        int[] a ={5,2,5,2,3,6};
        System.out.println(find(a));
    }

    
    static int find(int[] a){

        Set<Integer> set = new HashSet<>();
        for(int x : a){
            set.add(x);
        }

        return set.size() ;
    }
}

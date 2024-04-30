package com.vedant;

import java.util.HashSet;
import java.util.Set;

public class SizeofUnionOf2Array {
    public static void main(String[] args) {
        int[] a = {5,2,6,1,4,7,3,6};
        int[] b ={5,2,5,2,3,9,44,6};
        System.out.println(find(a,b));
    }

    static int find(int[] a ,int[] b){
        int count =0 ;

        Set<Integer> set = new HashSet<>();
        for(int x : a){
            set.add(x);
        }
        for(int y : b){
            set.add(y);

        }

          return set.size();

    }
}



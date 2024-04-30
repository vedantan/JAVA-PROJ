package com.vedant;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Demo {
    public static void main(String[] args) {
        int[] a = {1,3,4,4,2};
        System.out.println(find(a));


    }

    static int find(int[] a){

            Set<Integer> set = new HashSet<>();
            int len = a.length;
            for (int i = 0; i < len; i++) {
                if (set.contains(a[i])) {
                    return a[i];
                }else{
                    set.add(a[i]);
                }
            }

            return len;
        }
    }



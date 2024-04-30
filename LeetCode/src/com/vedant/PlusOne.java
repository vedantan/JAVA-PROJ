package com.vedant;

import java.lang.reflect.Array;

public class PlusOne {
    public static void main(String[] args) {
        int[] a ={1,2,9};
        System.out.println(plus(a));
    }
    static int plus(int[] a){
        int b = (int)Array.get(a,a.length-1);

        int c = b+1;

        return c;

    }
}

//class Solution {
//    public int[] plusOne(int[] d){
//        for(int i=d.length-1;i>=0;i--){
//            if(d[i] ==9){
//                d[i]=0;
//            }else{
//                d[i]++;
//                return d;
//            }
//        }
//        int[] res = new int[d.length+1];
//        res[0]=1;
//        return res;
//    }
//}

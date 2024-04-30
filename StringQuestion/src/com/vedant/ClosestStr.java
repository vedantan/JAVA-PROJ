package com.vedant;

import java.util.ArrayList;

public class ClosestStr {
    public static void main(String[] args) {
        String[] a = {"the", "quick", "brown", "fox", "quick"};
        String A = "quick";
        String b = "brown";
        System.out.println(diff(a,A,b));
    }
    static int diff(String[] a , String A , String B ){

        int count = Integer.MAX_VALUE;
        for(int i =0 ; i < a.length ; i++){

            if(a[i] == A){
                return i;
            }
            if(a[i] == B){
                return i;
            }
        }
        return count;
    }
}

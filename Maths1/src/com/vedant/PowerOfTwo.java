package com.vedant;
// 0 is exception
public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 32; //fix for n =0
        boolean ans = (n&(n-1)) == 0 ;


        System.out.println(ans);
    }
}

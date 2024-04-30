package com.vedant;

public class Swap2No {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        swap(a,b);
    }
    static void swap(int i , int j){
        i=i^j;
        j=i^j;
        i=i^j;
        System.out.println(i);
        System.out.println(j);
    }
}

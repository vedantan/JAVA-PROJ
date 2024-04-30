package com.vedant;

public class Squrt {
    public static void main(String[] args) {
        System.out.println(find(4));
    }
    static int find(int x){
//        x = 4;
        double b = Math.sqrt(x);
        int c = (int) b ;
        return c;
    }
}

package com.vedant;

public class SwappingWithoutThird {
    public static void main(String[] args) {
        int a =100;
        int b = 200;
        swap(a,b);
    }
    static void swap(int a ,int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("The value of a is " + a);
        System.out.println("The value of a is "  + b);
    }
}

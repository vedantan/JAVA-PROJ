package com.vedant;

public class BlockScope {
    public static void main(String[] args) {
        int a = 100;
        int c = 88;
        {
            int b = 20;
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }
        System.out.println(a);
//        System.out.println(b);  // function delecared inside scope will be access inside the scope
        System.out.println(c);
    }
}

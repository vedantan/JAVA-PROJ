package com.vedant;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int ans = sum();
        System.out.println(ans);
    }

    static int sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter value of a" + " ");
        int a = in.nextInt();
        System.out.println("enter value of b" + " ");
        int b = in.nextInt();
        int c = a+b;
        return c;
    }
}

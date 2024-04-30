package com.vedant;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a = 12165;
        int ans = 0;

        while(a>0){
            int rem = a%10;


            ans=ans*10+rem;
            a=a/10;
        }

        System.out.println(ans);
    }
}

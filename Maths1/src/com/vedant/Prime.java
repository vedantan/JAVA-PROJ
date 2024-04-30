package com.vedant;

public class Prime {
    public static void main(String[] args) {
        int n = 40;
        for(int i = 2 ; i <=n ; i++) {
            System.out.println(i + "  " + isprime(i));
        }

    }
    static String isprime(int n){
        if (n<=1){
            return "not prime";
        }
        int c = 2;
        while(c*c <= n){
           if (n%c == 0){
               return "not prime";
           }
           c++;
        }
        return  "prime";

    }
}
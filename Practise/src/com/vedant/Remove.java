package com.vedant;

import java.util.Arrays;

public class Remove {
    public static void main(String[] args) {
        int x = 24;
        int y = 36;
        gcd(x,y);
    }

   static void gcd(int x , int y ){
        int on1 = x;
        int on2 = y;

        while ( x % y != 0){
            int rem = x%y;
            x=y;
            y=rem;
        }
        int lcm = (on1*on2) / y;
        System.out.println("The lcm of given number is " + lcm);
        System.out.println("The Gcd of given number is " + y);
    }
}

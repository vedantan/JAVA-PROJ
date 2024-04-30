package com.vedant;

public class GCD_LCM {
    public static void main(String[] args) {
        int x = 24;
        int y = 36;

        gcd_lcm(x,y);
    }

    static void gcd_lcm(int x ,int y){
        int on1 = x ;
        int on2 = y ;

        while (x%y != 0){
            int rem = x%y;
            x=y;
            y=rem;

        }
        int gcd = y;
        int lcm = (on1*on2) / gcd ;
        System.out.println(gcd);
        System.out.println(lcm);
    }
}

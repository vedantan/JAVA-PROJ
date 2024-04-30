package com.vedant;
//weather the number is even or odd
// last digit is known as LSB
public class Main {

    public static void main(String[] args) {
        int n = 68;
        System.out.println(isodd(n));
    }
    static boolean isodd(int n){

        return (n&1) == 1;
    }
}

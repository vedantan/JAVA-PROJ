package com.vedant;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n=21;
        System.out.println(poweroftwo(n));
        System.out.println(power(n));

    }

    static boolean poweroftwo(int n){
        int temp=0;
        int power=0;
        while (temp < n){
            temp = (int)Math.pow(3,power);
            if(temp == n){
                return true;
            }
            power++;
        }
        return false;
    }

    static boolean power(int n){
        return (n & (n-1)) == 0;
    }
}

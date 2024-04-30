package com.vedant;

public class ithBit {
    public static void main(String[] args) {
        int a =10011;
        ithbit(a);

    }

    static void ithbit(int a){
        int mask = 1<<a;
        if((a&mask) == 1){
            System.out.println("odd");
        }else{
            System.out.println("even");
        }
    }
}

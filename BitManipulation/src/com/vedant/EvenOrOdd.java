package com.vedant;

public class EvenOrOdd {
    public static void main(String[] args) {
        int a = 6;
        evenorodd(a);
    }

    static void evenorodd(int i){
        if((i&1) == 0){
            System.out.println("Given no is Even");
        }
        if((i&1) == 1){
            System.out.println("Given no is odd");
        }
    }
}

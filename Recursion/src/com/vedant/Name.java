package com.vedant;

public class Name {
    public static void main(String[] args) {
        message(1);
    }

    static void message(int n){

        if(n==5){
            System.out.println("vinay");
            return;
        }
        System.out.println("vedant");
        message(n+1);

    }
}

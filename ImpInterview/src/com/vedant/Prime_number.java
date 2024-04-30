package com.vedant;

public class Prime_number {
    public static void main(String[] args) {
        System.out.println(primeno(2));
//        print(1,100);
    }
    static boolean primeno(int x ) {
        if(x < 2){
            return false;
        }
        if (x>=2){
            for (int i=2 ; i<x ; i++){
                if(x%i == 0){
                    return false;
                }
            }
        }
        return true;
    }

    static void print(int min , int max){
        for (int i=min ; i<=max ; i++){
            if(primeno(i)){
                System.out.print(i + " ");

            }
        }
    }
}

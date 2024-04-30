package com.vedant;
// if the no is 32 then 3*2 is the ans
public class ProductOfDigit {
    public static void main(String[] args) {
        int n = 32;
        System.out.println(fun(n));
    }
    static int fun(int n){
        if(n%10 == n){
            return n ;
        }
        return (n%10) * fun(n/10);
    }
}

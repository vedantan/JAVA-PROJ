package com.vedant;

public class ReverseANumber {
    public static void main(String[] args) {
        int n =5467;
        System.out.println(rev(n));
    }
    static int rev(int n){
        if(n%10 == n){
            return n;
        }
        int ans =0 ;
        while (n>0){
           int rem = n%10;
           ans = ans*10 + rem;
           n = n/10;

       }
        return ans;
    }

}

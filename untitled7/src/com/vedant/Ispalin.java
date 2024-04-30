package com.vedant;

public class Ispalin {
    public static void main(String[] args) {
        ispalin(12343211);
    }
    static void ispalin(int n){
        int ans =0 ;
        int temp = n;
        while(n>0){
            int rem = n%10;
            ans = ans*10 + rem;
            n= n/10;
        }
        if(ans == temp){
            System.out.println("Is Palindrome");
        }else{
            System.out.println("Is Not Palindrome");
        }
    }
}

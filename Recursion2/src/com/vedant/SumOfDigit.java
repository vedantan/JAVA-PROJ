package com.vedant;

public class SumOfDigit {
    public static void main(String[] args) {
        int a = 132;
        System.out.println(sum(a));
    }
    static int sum(int a){
        int ans =0;
       while (a>0){
           int rem = a%10;
           ans = ans + rem ;
           a = a/10;
       }
       return ans;
    }

}

package com.vedant;

public class Fact {
    public static void main(String[] args) {
        System.out.println(fact(0));
        System.out.println(fact2(0));
    }
    static int fact(int n){
        if(n<=1){
            return 1;
        }
        return fact(n-1)*n;
    }

    static int fact2(int n){
        int ans = 1;
        for (int i=n ; i>0 ;i--){
            ans = ans*i;
        }
        return ans;
    }

}

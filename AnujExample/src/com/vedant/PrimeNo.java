package com.vedant;

import java.util.Arrays;

public class PrimeNo {
    public static void main(String[] args) {
        boolean[] ans = prime(31);
        for(int i = 1 ; i<=31 ; i++){
            System.out.println(i + " " + ans[i]);
        }
        System.out.println("        ");
        System.out.println(isprime(7));

    }
    static boolean[] prime(int n){
        boolean[] ans = new boolean[n+1] ;
        Arrays.fill(ans,true);
        ans[0] = false;
        ans[1] = false;
        for(int i = 2 ; i*i <= n ; i++){
            for(int j = 2*i ; j <= n ; j= j+i){
               ans[j] = false;
            }
        }
        return ans ;
    }


    static String isprime(int n){
        if(n==1 ){
            return "given no is not prime" ;
        }

        if(n==2 ){
            return "given no is a prime" ;
        }

        for (int i=3 ; i<n ; i++){
            if(n%i ==0){
                return "given no is not prime";
            }
        }
        return "given no is prime";
    }
}

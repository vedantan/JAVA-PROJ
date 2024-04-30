package com.vedant;

public class Main {

    public static void main(String[] args) {
        System.out.println(prime(297));
//
    }
    static String prime(int n){
        if(n == 1 || n == 2){
            return "NOt a prime no";
        }
        for(int i=3 ; i<n ; i++){
            if(n%i == 0 ){
                return "Given no is not a prime no";
            }
        }
        return "Given no is a prime no";
    }


}

// Asci value of 0 = 47
// Asci value of 9 = 57
// Asci value of a = 96
// Asci value of z = 122
// Asci value of A = 65
// Asci value of z = 90

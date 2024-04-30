package com.vedant;
//check no is palindrome or not
public class Main {

    public static void main(String[] args) {
        int x = 12344321;
        System.out.println(ispalindrome(x));

    }
    static boolean ispalindrome(int x){
        if(x<=0){
            return false;
        }

        int number = x;
        int reverse =0;

        while(number>0){
            int rem = number%10;
            reverse = reverse*10 + rem;
            number = number/10;
        }
        return x == reverse;
    }
}


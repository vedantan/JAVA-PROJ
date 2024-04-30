package com.vedant;
// wheather it is palindrome or not using recursion
public class Main {

    public static void main(String[] args) {
        String s = "abcddcba";
        System.out.println(ispalin(s,s.charAt(0) , s.length()-1));
    }
    static boolean ispalin(String s, int l , int r){
        if( l >= r ){     //at some time l will come in at r from each other  means they are intersected
            return true;
        }
        if(s.charAt(0) != s.charAt(s.length()-1)){
            return false;
        }

        return ispalin(s,l+1,r-1);
    }
}

package com.vedant;

public class ReverseAString {
    public static void main(String[] args) {
        String a = "my name is vedant";
        reverse(a);
    }
    static void reverse(String a){
        String b = " ";
        for (int i= a.length() -1 ; i>= 0 ; i--){
             b = b + i ;

        }
        System.out.println(b);
    }
}

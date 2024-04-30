package com.vedant;

public class IsPalindrome {
    public static void main(String[] args) {
        String s = "v";
        System.out.println(isPalin(s));
        palin(s);
    }

    static boolean isPalin(String s){
        int size = s.length();
        if(size == 1 || size ==0){
            return true;
        }
        String l = s.substring(0,1); // start inclusive   end exclusive
        String r = s.substring(size-1); //  start inclusive

        if(l.equals(r)){
            return isPalin(s.substring(1,size-1));
        }
        return false;
    }

    static void palin(String s){
        String a ="" ;
        for (int i=s.length()-1 ; i>=0 ; i--){
             a =  a + s.charAt(i)  ;
        }
        if(s.equals(a)){
            System.out.println("given string is palindrome");
        }else{
            System.out.println("given string is not palindrome");
        }
    }
}

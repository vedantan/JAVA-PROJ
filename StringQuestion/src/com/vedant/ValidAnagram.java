package com.vedant;

public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isana("anagram","nagaram"));
    }

    static boolean isana(String a , String b){
        if(a.length() != b.length()){
            return false;
        }
        char[] c = new char[256];


        for(char ch : a.toCharArray()){
            c[ch]++;
        }

        for(char ch : b.toCharArray()){
            c[ch]--;
        }

        System.out.println(c.length);
        return c.length==256;
    }
}

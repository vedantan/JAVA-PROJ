package com.vedant;
// length of last word in the string

public class Lengthoflastword {
    public static void main(String[] args) {
        String a = "Hi, My name is Vedant";
        System.out.println(len(a));
    }
    static int len(String a){
        String str = a.trim();
//        split the given string with argument which we say
        String[] stri = str.split(" ");
        return stri[stri.length-1].length();
    }
}

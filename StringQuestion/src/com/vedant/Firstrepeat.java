package com.vedant;

import java.util.HashMap;
import java.util.HashSet;

public class Firstrepeat {
    public static void main(String[] args) {
        String  a = "vedevt";
        System.out.println(dup(a));
    }
    static  char dup(String a){
        char[] ch = a.toCharArray();

        HashSet<Character> h = new HashSet<>();

        for(int i =0 ; i< ch.length ; i++){
            char c = a.charAt(i);

            if(h.contains(c)){
                return c ;
            }else{
                h.add(c);
            }
        }

        return '0';
    }
}

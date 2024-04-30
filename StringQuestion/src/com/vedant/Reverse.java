package com.vedant;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        String a = "vedant  anil";
        String c = "nillawar";
        String b ="";
        System.out.println(rev(a,b));
        System.out.println(rev2(c,b));

    }
    static String rev(String a , String b){
        for(int i = a.length()-1 ; i>=0 ; i--){
             b = b + a.charAt(i);
        }
        return b;
    }

    static String rev2(String c , String b){
        for(int i=0 ; i <c.length() ; i++){
            char ch = c.charAt(i);
            b = ch+b;
        }
        return b;
    }


}

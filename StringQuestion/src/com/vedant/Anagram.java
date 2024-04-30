package com.vedant;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String a = "vedant";
        String b = "ednvta";

        System.out.println(find(a,b));

    }

    static boolean find(String a, String b){
        if(a.length() != b.length()){
            return false;
        }
        char[] ch = a.toCharArray();
        char[] c = b.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(c);
        for(int i = 0 ; i<a.length() ;i++){
            if(ch[i] != c[i]){
                return  false;

            }
        }
        return  true;

    }
}

// Asci value of 0 = 47
// Asci value of 9 = 57
// Asci value of a = 96
// Asci value of z = 122
// Asci value of A = 65
// Asci value of z = 90
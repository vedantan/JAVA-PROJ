package com.vedant;

import  java.util.Set;
import java.util.HashSet;

public class StringCharacterAllunique {
    public static void main(String[] args) {
        String a = "vedant";
        all(a);

    }
    static  void all(String a){
        Set<Character> set = new HashSet<>();
        for(int i=0 ; i<a.length() ; i++ ){
            set.add(a.charAt(i));
        }
        if(set.size() == a.length()){
            System.out.println("String does not contain Duplicate character");
        }else{
            System.out.println("String contain dupliacte");

        }
    }
}

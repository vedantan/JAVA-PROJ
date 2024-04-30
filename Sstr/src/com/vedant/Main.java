package com.vedant;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	String str = "abcbar";
        System.out.println(ispalindrome(str));

    }

    static boolean ispalindrome(String str){
        if(str == null || str.length() == 0){
            return false;
        }

        str = str.toLowerCase();
        for(int i =0 ; i <= str.length() -1 ; i++){
            char start = str.charAt(i);
            char end = str.charAt(str.length() -1 -i);

            if(start != end){
                return false;
            }
        }
        return true;
    }
}

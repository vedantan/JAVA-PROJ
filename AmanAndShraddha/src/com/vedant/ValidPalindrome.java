package com.vedant;

import java.util.Locale;

public class ValidPalindrome {
    public static void main(String[] args) {
        String p = "A man : nam ,a ";
        System.out.println(pal(p));

    }
    static boolean pal(String p ){
        if(p.length() == 0){
            return true;
        }

        p=p.toLowerCase();
        p = p.trim();
        int start = 0 ;
        int end = p.length()-1;
        while(start <= end) {
            if (!Character.isLetterOrDigit(p.charAt(start))) {
                start++;
            } else if (!Character.isLetterOrDigit(p.charAt(end))) {
                end--;
            } else if (p.charAt(start) == p.charAt(end)) {
                start++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }

}

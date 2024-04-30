package com.vedant;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Paanama";
        System.out.println(palin(s));
    }

    static boolean palin(String s){
        s=s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (int i=0 ; i<s.length() ; i++){
                if(Character.isLetterOrDigit(s.charAt(i) ) == true){
                            sb.append(s.charAt(i));
                }
        }

        if(sb.length() <=1){
            return true;
        }

        for (int i=0 ; i<sb.length()/2 ; i++){
            if (sb.charAt(i) != sb.charAt(sb.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}

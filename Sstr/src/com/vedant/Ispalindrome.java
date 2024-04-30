package com.vedant;

public class Ispalindrome {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(ispalindrome(str));
    }
    static boolean ispalindrome(String str){
        if(str.isEmpty() || str.length() == 0){
            return false;
        }
        str = str.toLowerCase();
        str = str.trim();
        for(int i =0 ; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
//
//    if(s1.length()<1){
//        return true;
//        }
//
//        for(int i=0; i<=s1.length()/2;i++){
//        if(s1.charAt(i)!=s1.charAt(s1.length()-i-1)){
//        return false;
//        }
//        }
//        return true;
//        }

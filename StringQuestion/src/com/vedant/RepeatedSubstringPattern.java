package com.vedant;

public class RepeatedSubstringPattern {
    public static void main(String[] args) {
        String s ="abcabcabcabc";
        System.out.println(isRepeated(s));
    }

    static boolean isRepeated(String s){
        int n = s.length();
        for (int i=0 ; i<n/2 ; i++){
            String str = s.substring(0,i+1);
            if( n % str.length() == 0){
                int noOfOcc = n / s.length();
                StringBuilder sb = new StringBuilder();
                while (noOfOcc > 0){
                    sb.append(str);
                    noOfOcc--;
                }

                if(sb.toString().equals(s)){
                   return true;
                }
            }
        }
        return false;
    }
}

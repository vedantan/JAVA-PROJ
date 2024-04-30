package com.vedant;

public class UpperCaseToLowerCase {
    public static void main(String[] args) {
        System.out.println(uppercasetolowerCase("VeDANT"));
    }

    static String uppercasetolowerCase(String s){
       String str = "";

       for (int i=0 ; i<s.length() ;i++){
           if(s.charAt(i) >= 65 && s.charAt(i) <= 90){
               str = str + (char)(s.charAt(i)+32);
               continue;
           }
           str = str+s.charAt(i);
       }
       return str;
    }
}

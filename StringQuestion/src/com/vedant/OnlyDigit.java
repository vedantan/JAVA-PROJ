package com.vedant;

public class OnlyDigit {
    public static void main(String[] args) {
        String a = "1234-";
        
        System.out.println(predict(a));

    }


    static String predict(String a){
        for(int i=0 ; i<a.length() ; i++){
            if(a.charAt(i) <= 47 || a.charAt(i) >=57){
                return "the string does not totally contain digit";
            }
        }
        return "the string  totally contain digit";
    }

}

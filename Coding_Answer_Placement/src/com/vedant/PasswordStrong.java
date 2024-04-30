package com.vedant;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PasswordStrong {
    public static void main(String[] args) {
        String a = "akjkG@vk c12$";
        strongorweak(a);
    }
    static void strongorweak(String a){
        char ch;
        boolean uppercase = false;
        boolean lowercase = false;
        boolean numberflag = false;



        Pattern p = Pattern.compile("[^A-Za-z0-9 ]");
        Matcher m = p.matcher(a);


        for (int i=0 ; i<a.length() ; i++){
            ch = a.charAt(i);
            if(Character.isDigit(ch)) numberflag = true;
            if(Character.isUpperCase(ch)) uppercase = true;
            if(Character.isLowerCase(ch)) lowercase = true;

            if(a.length() >= 8 && a.charAt(a.length()-1) == '$' && numberflag && uppercase && lowercase && m.find()){
                 System.out.println("Given password is strong");
                 return;
            }
        }
        if(a.charAt(a.length()-1) != '$' || a.length() <8){
            System.out.println("Given password is not strong");
        }
        else{
            System.out.println("Given password is not strong");
        }

    }
}

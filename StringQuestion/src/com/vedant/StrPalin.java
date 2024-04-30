package com.vedant;

public class StrPalin {
    public static void main(String[] args) {
        String a = "rasdsar";
        String b = "";
        pal(a,b);
    }

    static void pal(String a, String b){
        int  len = a.length() - 1;

        for(int i = len ; i >= 0  ; --i){
            b = b + a.charAt(i);
        }

        if(a.toLowerCase().equals(b.toLowerCase())){
            System.out.println("given String is palindrome");
        }else{
            System.out.println("given string is not palindrome");
        }
    }
}

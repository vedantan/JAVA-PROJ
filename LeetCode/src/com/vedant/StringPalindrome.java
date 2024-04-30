package com.vedant;

public class StringPalindrome {
    public static void main(String[] args) {
        String a = "vepdev";
        String r = "";

        int rlength = a.length();
// i is upto 0 so length -1

        for (int i = a.length()-1 ; i>=0 ; --i){
            r = r + a.charAt(i);
        }
        if(a.toLowerCase().equals(r.toLowerCase())){
            System.out.println("String is palindrome");
        }else{
            System.out.println("String is not palindrome");
        }


    }
}

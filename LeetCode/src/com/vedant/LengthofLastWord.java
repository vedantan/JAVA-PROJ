package com.vedant;

public class LengthofLastWord {
    public static void main(String[] args) {
        String str = "hello friends";
        System.out.println(len(str));

    }
    static int len(String str){
        String st = str.trim();
        String[] St = st.split(" ");
        return   St[St.length-1].length() ;

    }
}





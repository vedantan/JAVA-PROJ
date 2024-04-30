package com.vedant;

import java.util.HashMap;

public class Stringbuilder {
    public static void main(String[] args) {

        StringBuilder sb= new StringBuilder("hello");
//        app(sb);
//        System.out.println(sb.length());

//        rev(sb);

        String s = "abcd", t = "abcde";
        System.out.println(diff(s,t));

    }

    static void app(StringBuilder sb){
        sb.append("e");
        sb.append("l");
        sb.append("l");
        sb.append("o");
        System.out.println(sb);
    }

    static void rev(StringBuilder sb){
        for (int i=0 ; i<sb.length() /2 ; i++){
            int front = i;
            int back = sb.length()-1 -i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);


            sb.setCharAt(front , backChar);
            sb.setCharAt(back,frontChar);
        }
        System.out.println(sb);
    }

    static char diff(String s ,String t){
        StringBuilder sb = new StringBuilder();
        for(int i=0 ; i<t.length() ;i++){
            sb.append(t.charAt(i));
        }



        return sb.charAt(0);
    }


}

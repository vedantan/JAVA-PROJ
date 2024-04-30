package com.vedant;

public class StringExample {
    public static void main(String[] args) {
       String ans = str("vedant");
       System.out.println(ans);

    }
    static String str(String name){
        String message = "my name is " + name;
        return message;
    }
}

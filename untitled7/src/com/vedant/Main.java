package com.vedant;
// phone no dial
public class Main {

    public static void main(String[] args) {
        google("","12");
    }
    static void google(String p ,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0' ;
        for(int i = (digit - 1)*3 ; i < digit*3 ; i++ ){
            char ch = (char) ('a' + i);
            google(p+ch, up.substring(1));
        }

    }
}

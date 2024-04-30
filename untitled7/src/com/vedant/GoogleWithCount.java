package com.vedant;

public class GoogleWithCount {
    public static void main(String[] args) {
        System.out.println(googlecount("" , "12"));

    }
    static int googlecount(String p , String up){
        if(up.isEmpty()){
            return 1;
        }
        int count = 0;
        int digit = up.charAt(0) - '0' ;
        for(int i = (digit -1)*3 ; i < digit*3 ; i++){
            char ch = (char)('a' + i);
            count = count + googlecount(p +ch , up.substring(1));
        }
        return count;
    }
}

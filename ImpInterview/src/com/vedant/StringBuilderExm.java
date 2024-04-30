package com.vedant;

public class StringBuilderExm {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("mcmoibno");
        System.out.println(mani(sb));
    }

    static StringBuilder mani(StringBuilder sb){

        if(sb.charAt(0) == 'M'){
            // this deletes the 0(zero) index
            sb.delete(0,1);
        }

        for (int i=1 ; i<sb.length()-1 ; i++){
            char next = sb.charAt(i+1);
            if(sb.charAt(i) == 'm'){
                sb.delete(i , i+1);
                sb.insert(i , next);
            }
        }

        for (int i=1 ; i<sb.length() ; i++){
            char prev = sb.charAt(i-1);
            if(sb.charAt(i) == 'n'){
                sb.delete(i , i+1);
                sb.insert(i , prev);
            }
        }
        return sb;
    }

}
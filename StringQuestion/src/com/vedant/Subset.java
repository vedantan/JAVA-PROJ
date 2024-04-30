package com.vedant;

public class Subset {
    public static void main(String[] args) {
        powerset("abc" , 0 , "");
    }

    static void powerset(String s , int i , String curr){

        if(i == s.length()){
            System.out.println(curr);
            return;
        }


        powerset(s,i+1,curr + s.charAt(i));
        powerset(s,i+1,curr);

    }

}

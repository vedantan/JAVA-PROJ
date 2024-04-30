package com.vedant;

public class StringRotation {
    public static void main(String[] args) {
        String a = "abcd";
        String b = "bcda";

        if(arerotation(a,b)){
            System.out.println("given string is rotation");
        }else{
            System.out.println("Given strings are not rotation strin ");
        }
    }
    static boolean arerotation(String a , String  b){
        return (a.length() == b.length() && (a+a).indexOf(b) != -1);
    }
}

package com.vedant;

public class StringPalin {
    public static void main(String[] args) {
        String a = "radar";
//        System.out.println(pal(a));
        System.out.println(ispal(a));
    }
//    static boolean pal(String a ){
//        int i = 0 ;
//        int j = a.length()-1;
//
//        while(i<j){
//            if(a.charAt(i) != a.charAt(j)){
//                return false;}
//            i++;
//            j--;
//        }
//        return true;
//    }

    static boolean ispal(String a){
        int i=0;
        int j=a.length()-1;

        while (i<j){
            if(a.charAt(i) != a.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }


}

package com.vedant;
// wheather string is palindrome or not

public class Main {

    public static void main(String[] args) {
	   String a = "radar";
       System.out.println(pal(a));

    }
    static boolean pal(String a ){
        int i = 0;
        int j = a.length() -1;

        while(i<j){
            if(a.charAt(i) != a.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}

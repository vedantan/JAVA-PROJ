package com.vedant;

public class IsPalin {
    public static void main(String[] args) {
        System.out.println(ispalin("vedantnadev"));

    }
    static boolean ispalin(String a){
        char[] c = a.toCharArray();
        int s = 0;
        int e = a.length()-1;
        while (s<e){
            if(c[s] != c[e]){
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
}

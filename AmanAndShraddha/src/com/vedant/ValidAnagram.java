package com.vedant;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "cat";
        String t = "rat";
        System.out.println(anagram(s,t));
    }
    static boolean anagram(String s ,String t){
        s = s.toLowerCase();
        t = t.toLowerCase();
        char[] ch = s.toCharArray();
        char[] chh = t.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(chh);

        if(s.length() != t.length()){
            return false;
        }
        for(int i=0 ; i<s.length() ; i++){
            if(ch[i] != chh[i]){
                return false;
            }
        }
        return true;

    }
}

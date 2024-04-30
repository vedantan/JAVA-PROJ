package com.vedant;
// no 28   implement strstr


public class Strstr {
    public static void main(String[] args) {
        String haystack = "hetbvllo";
        String needle = "z";
        System.out.println(find(haystack,needle));


    }

    static  int find(String haystack, String needle){
        int count = 0;
         if(haystack.contains(needle)){
             count = haystack.indexOf(needle);
         }else{
             return -1;
         }
         return count;
    }
}

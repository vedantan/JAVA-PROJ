package com.vedant;

public class Anagram {
    public static void main(String[] args) {
        String a = "aawdbc";
        String b = "wabcda";
        System.out.println("the first is ");
        Anagram(a,b);

    }

    static void Anagram(String a , String b){
        boolean isAnagram = true;
        int[] al = new int[256];

        for (char x : a.toCharArray()){
            int index = (int) x;
            al[index]++;
        }
        for(char x : b.toCharArray()){
            int index = (int) x;
            al[index]--;
        }

        for (int i=0 ; i<256 ; i++){
            if(al[i] != 0){
                isAnagram = false;

            }
        }

        if(isAnagram){
            System.out.println("Anagram");
        }else{
            System.out.println("Not-anagram");
        }
    }


}

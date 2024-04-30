package com.vedant;
// problem no 345 on leetcode
// https://www.youtube.com/watch?v=hgtH9FIZrOE


public class ReverseVowelsOfString {
    public static void main(String[] args) {
        String s ="leetcode";
        System.out.println(reverseStingVowel(s));
    }

    static String reverseStingVowel(String s){
        char[] arr = s.toCharArray();
        int i=0;
        int j=0;

        while (i<j){
            while (i<j && isVowel(arr , i) == false){
                i++;
            }
            while (i<j && isVowel(arr , j) == false){
                j--;
            }

            swap(arr,i,j);
            i++;
            j--;
        }

        String str = "";
        for (char c : arr){
            str = str+c;
        }
        return str;
    }

    static boolean isVowel(char[] arr , int i){
        char c = arr[i];

        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'O' || c == 'I' || c == 'E' ||c == 'U' ){
            return true;
        }
        return false;
    }

    static void swap(char[] arr , int i , int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

package com.vedant;


// problem no 383 on leetcode
public class RansomNote {
    public static void main(String[] args) {
        String   ransomNote = "ab", magazine = "ab";
        System.out.println(search(ransomNote , magazine));

    }

    static boolean search(String a , String b){
        if(a.length() > b.length()){
            return false;
        }
        int[] arr = new int[26];

//        for (int i=0 ; i<b.length() ; i++){
//            arr[b.charAt(i) - 'a']++;
//        }
        for (char c : b.toCharArray()){
            arr[c-'a']++;
        }

        for (char c : a.toCharArray()){
            if(arr[c-'a'] == 0) return false;
            arr[c-'a']--;
        }

//        for (int i=0 ; i<a.length() ; i++){
//            if(arr[a.charAt(i)] == 0) return false;
//            arr[a.charAt(i) - 'a']--;
//        }

        return true;
    }
}

package com.vedant;

public class ReversewordCharacter {
    public static void main(String[] args) {
          String a = "I Love Java Programming";
          rev1(a);
    }
    static void rev1(String a){
        String [] str = a.split(" ");
        String reversestring = "";

        for(int i = 0 ; i < str.length ; i++){
            String word = str[i];
            String  reverseword = "";
            for(int j = word.length() -1 ; j >= 0 ; j--){
                  reverseword = reverseword + word.charAt(j) ;
            }

            reversestring = reversestring + reverseword + " ";

        }
        System.out.println(reversestring);
    }
}

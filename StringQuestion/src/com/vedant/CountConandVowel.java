package com.vedant;

public class CountConandVowel {
    public static void main(String[] args) {
        String a= "M94Y name is vedant";
        count(a);
    }
    static void count(String a){
        String str = a.toLowerCase();
        int vcount = 0;
        int ccount = 0;

        for(int i =0 ; i < str.length() ; i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' ||str.charAt(i) == 'o' ||str.charAt(i) == 'u'){
                vcount = vcount +1;

            }
            else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                ccount = ccount +1 ;

            }

        }
        System.out.println("vowels are " + vcount);
        System.out.println("consonants are " + ccount);

    }
}

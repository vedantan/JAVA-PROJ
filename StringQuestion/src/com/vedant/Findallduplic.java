package com.vedant;
// Program to find the duplicate characters in a string

//  ch[i] != ' ' && ch[j] = '0'  && ch[i] != '0'


public class Findallduplic {
    public static void main(String[] args) {
        String a = "Great responsibility";
        dup(a);
    }

    static void dup(String a) {
        char[] ch = a.toCharArray();
        int count = 0;

        for (int i = 0; i < ch.length; i++) {
            count = 1;
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j] && ch[i] != ' ') {
                    count++;

                    //Set string[j] to 0 to avoid printing visited character
                    ch[j] = '0';
                }
            }
            if (count > 1 && ch[i] != '0') {
                System.out.println(ch[i] + "  " + count);
            }
        }
    }
}

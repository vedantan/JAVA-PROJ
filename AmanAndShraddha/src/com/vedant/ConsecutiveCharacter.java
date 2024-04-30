package com.vedant;

public class ConsecutiveCharacter {
    public static void main(String[] args) {
        String A = "aabba";
        remove(A);

    }
    static void remove(String a) {

        int s = a.length() - 1;
        String str = "";
        for (int i = 0; i < s; i++) {
            if (a.charAt(i) != a.charAt(i + 1)) {
                str = str+a.charAt(i);
            }
        }
        str = str + a.charAt(s);
        System.out.println(str);
    }
}

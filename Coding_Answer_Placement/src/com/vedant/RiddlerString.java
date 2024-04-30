package com.vedant;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RiddlerString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Input String--> ");
        String a = sc.next();
        riddler(a);

    }

    static void riddler(String a) {
        int l = a.length();
        char[] ch = a.toCharArray();
        int count = 0;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < a.length(); i++) {
            set.add(a.charAt(i));
            count = set.size();
        }

        System.out.println(a + " " + l + " " + count);
    }
}
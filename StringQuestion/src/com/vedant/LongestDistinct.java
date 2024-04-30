package com.vedant;

import java.util.HashSet;

public class LongestDistinct {
    public static void main(String[] args) {
        String s = "geeksforgeeks";

        System.out.println(find(s));

    }

    static int find(String s){
        int i = 0, j = 0, max = 0;

        HashSet<Character> set = new HashSet<>();

        while (j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                max = Math.max(max, set.size());
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return max;
    }

}

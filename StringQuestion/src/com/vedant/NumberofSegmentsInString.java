package com.vedant;

import java.util.ArrayList;
// problem no 434 on leetcode
// all test cases passed by own

public class NumberofSegmentsInString {
    public static void main(String[] args) {
        String s = ", , , ,        a, eaefa";
        System.out.println(noOfSegment(s));
    }
    static int noOfSegment(String s){
        if(s.length() == 0){
            return 0;
        }

        int count=0;
        String[] str = s.split(" ");
        for (int i=0 ; i<str.length ; i++){
            if(str[i].length() >= 1){
                count++;
            }
        }

        return count;
    }
}

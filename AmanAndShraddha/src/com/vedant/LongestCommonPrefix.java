package com.vedant;

import java.util.HashSet;
import java.util.Set;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] arr = { "flower" , "flow" ,"flight"};
        System.out.println(longest(arr));

    }
    static String longest(String[] arr) {
        if(arr.length == 0){
            return "";
        }

        String prefix = arr[0];
        for(int i=1 ;i< arr.length ; i++){
//            The Java String class indexOf() method returns the position
//            of the first occurrence of the specified character or string in a specified string
            while(arr[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
    }
}

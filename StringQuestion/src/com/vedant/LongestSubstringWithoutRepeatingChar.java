package com.vedant;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingChar {
    public static void main(String[] args) {
        String s = "abcbaca";
        System.out.println(longest(s));
    }

    static int longest(String s){
        int length =0;
        Map<Character , Integer> map = new HashMap<Character , Integer>();

        char[] c = s.toCharArray();

        for (int i=0 ; i<s.length() ; i++){
            char ch = c[i];
            if(!map.containsKey(ch)){
                map.put(ch,i);
            }else{
                i = map.get(ch);
                map.clear();
            }

            if(map.size() > length){
                length = map.size();
            }
        }

        return length;
    }
}






package com.vedant;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        String a = "bvaedbantbbb";
        System.out.println(longest(a));
    }
    static int longest(String a){
       int length = 0;
       char[] c = a.toCharArray();
        Map<Character , Integer> map = new HashMap<>();
        for(int i=0 ; i< a.length() ; i++){
          if(!map.containsKey(c[i])){
              map.put(c[i] , i);
          }else{
              i = map.get(c[i]);
              map.clear();
          }
          if(map.size() > length){
              length = map.size();
          }
     }
        return length;
    }
}

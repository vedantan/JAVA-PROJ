package com.vedant;

import java.util.HashMap;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String a ="abbca"   , b ="czzc";
        String s = "abba", t = "dog cat cat dog";
//        System.out.println(isisomorphic(a,b));         // problem on leetcode
//        System.out.println(wordpatternn(s,t));        // problem no 290 on leetcode
        System.out.println(find(a));             // First Unique Character in a String  ||  problem no 387 on leetcode
    }

    static boolean isisomorphic(String s ,String t){
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character,Character> map = new HashMap<Character,Character>();

        for (int i=0 ; i<s.length() ;i++){
            if(!map.containsKey(s.charAt(i)) && !map.containsValue(s.charAt(i))){
                map.put(s.charAt(i) , t.charAt(i));
            }else if(map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) == t.charAt(i)) {
                    continue;
            }else{
                return false;
            }
        }

        return true;

    }

    static boolean wordpatternn(String s ,String t){
        HashMap<Character,String> map = new HashMap<Character,String>();
        String[] str = t.split(" ");
        for (int i=0 ; i<s.length() ;i++){
            if(!map.containsKey(s.charAt(i)) && !map.containsValue(str[i])){
                map.put(s.charAt(i) , str[i]);
            }else if(map.containsKey(s.charAt(i)) &&  map.get(s.charAt(i)).equals(str[i]) ) {
                continue;
            }else{
                return false;
            }
        }

        return true;

    }


  static int find(String s){
      HashMap<Character , Integer> map = new HashMap<Character, Integer>();
      for(int i=0; i<s.length() ; i++){
          char ch = s.charAt(i);
          if(map.containsKey(ch)){
              map.put(ch , map.get(ch)+1);
          }else{
              map.put(ch  , 1);
          }
      }

      for (int i=0 ; i<s.length() ;i++){
          if(map.get(s.charAt(i)) == 1) {
              return i;
          }
      }
      return -1;
  }
}

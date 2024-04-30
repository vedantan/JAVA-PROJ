package com.vedant;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;

public class PrintAllDuplicate {
    public static void main(String[] args) {
        String a = "geegforgeeks";
        print(a);
    }

    static void print(String a){
        char[] string = a.toCharArray();
        int count = 0;

        for(int i =0 ; i<string.length ; i++){
            count = 1;
            for(int j = i+1; j<string.length ; j++){
                if(string[i] == string[j] && string[i] != ' '){
                    count ++;

                    string[j] = '0' ;
                }
            }
            if(count>1 && string[i] != '0'){
                System.out.println(string[i] + "  " +count);
            }
        }








//        Set<Character> set = new HashSet<>();
//        HashMap<Integer , Character> map = new HashMap<Integer, Character>();
//        for(int i = 0 ; i<a.length() ; i++){
//            if(map.containsValue(a.charAt(i))){
//                set.add(a.charAt(i));
//                System.out.print(a.charAt(i));
//
//            }
//            map.put(i , a.charAt(i));
//
//        }

    }
}

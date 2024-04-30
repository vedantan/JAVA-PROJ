package com.vedant;
import java.util.Set;
import java.util.HashSet;
// question no 4

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(contain(arr));

        String a = "vedanta" ;
        System.out.println(all(a));

    }
    static boolean contain(int[] arr){
        Set<Integer> set = new HashSet<>();

        for( int a: arr){
            if(set.contains(a)){
                return true;
            }else{
                set.add(a);
            }

        }
        return false;

    }

    static boolean all(String a){
        Set<Character> set = new HashSet<Character>();

        for(int i=0 ; i < a.length() ; i++ ) {
            char b = a.charAt(i);
            if (set.contains(b)){
                return false;
            }else{
                set.add(b);
            }

        }
        return true;
    }

}

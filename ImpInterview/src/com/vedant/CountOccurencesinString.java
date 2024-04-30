package com.vedant;

import java.util.Arrays;

public class CountOccurencesinString {
    public static void main(String[] args) {
        String a = "prepinsta is in best";
        String b = "in";

        find(a,b);
    }

    static void find(String a , String b) {
        int count =0;
      String[] c = a.split(" ");
      for (int i=0 ; i<c.length ;i++){
          if(b.equals(c[i])){
              count++;
          }
      }
        System.out.println(count);
        System.out.println(Arrays.toString(c));
    }
}

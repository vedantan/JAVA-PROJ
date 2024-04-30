package com.vedant;

import java.util.HashMap;
import java.util.Scanner;

public class Practise {
//   public static void main(String[] args) {
//      Scanner sc = new Scanner(System.in);
//      int n = sc.nextInt();
//      for (int i=0 ; i<n ; i++){
//         String no = sc.next();
//         getresult(no);
//      }
//   }
//
//
//   static void getresult(String no){
//      char[] ch = no.toCharArray();
//      char[] ans = new char[ch.length];
//      int ind =0;
//      for (int i=0 ; i<ch.length ; i=i+2){
//         ans[ind++] = ch[i];
//      }
//      for(int i=1 ; i<ch.length ; i=i+2){
//         ans[ind++] = ch[i];
//      }
//      no = new String(ans);
//      System.out.println(no);
//   }

//   public static void main(String[] args) {
//      rearrange(10 , 123467890);
//   }
//
//   static String rearrange(int n, long x){
//      String ans = "";
//      for (int i=0 ; i<n ; i++){
//         String even ="";
//         String odd = "";
//         long temp = x;
//         for (int k=1 ; k<=10 ; k++){
//            if(k%2 ==0 ){
//               even = temp % 10 + even;
//               temp = temp/10;
//
//            }else{
//               odd = temp %10 + odd;
//               temp  = temp /10;
//
//            }
//         }
//         ans = even+odd;
//      }
//      return ans;
//   }


   public static void main(String[] args) {
      String [] s =  {"Java","C","C++","Python","JavaScript"};
      for(String name: s){
         System.out.println(name);
      }
   }


}


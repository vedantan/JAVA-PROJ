package com.vedant;

public class AddBinary {
    public static void main(String[] args) {
        System.out.println(addbinary("111","11"));
    }

    static String addbinary(String s , String st){
        int i = s.length()-1;
        int j = st.length()-1;
        StringBuilder sb =new StringBuilder();
        int carry=0;
         while (i>=0 || j>= 0){
             int sum=carry;
             if(i>= 0){
                 sum = sum+s.charAt(i) - '0';
                 i--;
             }
             if(j>= 0){
                 sum = sum+st.charAt(j) - '0';
                 j--;
             }

             carry = sum>1 ? 1: 0;
             sb = sb.append((sum%2));
         }

         if(carry != 0){
             sb.append(carry);
         }

         return sb.reverse().toString();
    }
}

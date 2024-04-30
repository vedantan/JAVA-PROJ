package com.vedant;

public class Stringtointeger {
    public static void main(String[] args) {
        String a = "-a42";
        System.out.println(find(a));

    }
    static int find(String a){
        for(int i=0 ; i<a.length() ; i++){
            char ch = a.charAt(i);
            if(i == 0 && ch == '-'){
                continue;
//                Character.isDigit(char ch) is an inbuilt method in java which
//                determines whether a specified character is a digit or not.
            }else if(!Character.isDigit(ch)){
                  return -1;
            }

        }
//       parseInt(String s) − This returns an integer (decimal only).
        return Integer.parseInt(a);
    }
}

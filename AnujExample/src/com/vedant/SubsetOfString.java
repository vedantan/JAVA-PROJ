package com.vedant;

public class SubsetOfString {
    public static void main(String[] args) {
        String s = "abc";
        powerset(s,0,"");
        System.out.println("  ");
        sub("" , "abc");
    }

    static void powerset(String  s , int i , String curr){ // i refers to index
        if(i == s.length()){
            System.out.println(curr);
            return;
        }
// i starts with 0 in line no 6
        powerset(s,i+1,curr);
        powerset(s,i+1,curr+s.charAt(i));


    }

    static void sub(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        sub(p,up.substring(1));
        sub(p+ch , up.substring(1));

    }

}

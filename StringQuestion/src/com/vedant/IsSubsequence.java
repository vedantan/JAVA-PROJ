package com.vedant;

public class IsSubsequence {
    public static void main(String[] args) {
        System.out.println(issubseq("hgd" ,"ahbgdc"));
    }
    static boolean issubseq(String a , String b){
        int i=0;
        int j=0;
        while (i<a.length() && j<b.length()){
            if(a.charAt(i) == b.charAt(j)) {
                i++;
            }
                j++;
        }
        return i==a.length();
    }
}

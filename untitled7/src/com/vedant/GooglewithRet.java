package com.vedant;

import java.util.ArrayList;

public class GooglewithRet {
    public static void main(String[] args) {
        System.out.println(googleRet("" ,"12"));

    }
    static ArrayList<String> googleRet(String p , String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        int digit = up.charAt(0) - '0';
        for(int i = (digit - 1)*3 ; i < digit *3 ; i++){
            char ch = (char) ('a' + i);
//            return googleRet(ch+p ,up.substring(1));
            ans.addAll(googleRet(p+ch,up.substring(1)));
        }
        return ans;
    }
}

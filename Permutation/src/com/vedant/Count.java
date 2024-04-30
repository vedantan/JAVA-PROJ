package com.vedant;

public class Count {
    public static void main(String[] args) {
        System.out.println(countper("" , "abbjkc"));
    }
    static int countper(String p, String up){
        if(up.isEmpty()){
            return 1;
        }
        int count =0;
        char ch = up.charAt(0);
        for(int i = 0 ; i <= p.length() ; i++){
            String f = p.substring(0,i);
            String l = p.substring(i,p.length());
            count = count + countper(ch+f+l , up.substring(1));
        }
        return count;
    }
}

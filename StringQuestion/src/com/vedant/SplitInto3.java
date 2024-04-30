package com.vedant;

public class SplitInto3 {
    public static void main(String[] args) {
        String s = "SOSOOSOSOSOSOSSOSOSOSOSOSOS";
        into3(s);
    }

    static void into3(String s){
        int count=0;
        String []str = s.split("(?<=\\G...)");
        int total = str.length;
        for (String sa : str){
            if(sa.equals("SOS")){
                count++;
            }
            System.out.println(sa);
        }
        System.out.println("sos count is=> " + count);
        System.out.println(total);
        System.out.println(total-count);

    }
}

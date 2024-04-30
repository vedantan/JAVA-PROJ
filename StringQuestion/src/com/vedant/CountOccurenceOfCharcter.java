package com.vedant;

public class CountOccurenceOfCharcter {
    public static void main(String[] args) {
        String a = "Today is Monday , And I Am working from tomorrow ";
        System.out.println(count(a));
    }


    static int count(String a){
        String str = a.toLowerCase();
        int count = 0;
        for(int i =0 ; i < str.length() ; i++){
            if(str.charAt(i) == 'a'){
                count = count+1;
            }
        }
        return count;
    }
}

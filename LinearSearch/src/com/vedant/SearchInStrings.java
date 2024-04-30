package com.vedant;

public class SearchInStrings {
    public static void main(String[] args) {

        String str = "vedant";
        char target = 'c';
        System.out.println(Search(str, target));
    }

    static int Search(String str , char target){
        if(str.length() == 0){
            return 0;
        }

        for(int i=0 ; i<str.length() ; i++){
            if(target == str.charAt(i)){
                return i;
//                return Integer.toString(i).charAt(0);
//                if you want index no
            }
        }
    return -1;
    }
}

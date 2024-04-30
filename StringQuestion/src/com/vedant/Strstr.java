package com.vedant;
// returns first occurence of Str b in Str a
public class Strstr {
    public static void main(String[] args) {
        String a = "hello";
        String b = "ll";
      
        System.out.println(find(a,b));

    }
    static int find(String a , String b){
        int index = 0;
        if(a.contains(b)){
            index  = a.indexOf(b);
        }else{
            return -1;
        }

        return index;
    }
}

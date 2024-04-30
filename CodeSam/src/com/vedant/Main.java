package com.vedant;

public class Main {

    public static void main(String[] args) {
	  String a = "vedant" ;
        System.out.println(find(a));

    }

    static String find(String str){
        if(str.length()  == 0){
            return "String Not Found" ;
        }

        String a = "";
        for(int i = str.length()-1 ; i>=0 ; i--){
            a = a + str.charAt(i);


        }
        return a;



    }
}

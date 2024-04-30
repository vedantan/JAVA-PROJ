package com.vedant;

public class Josh {
    public static void main(String[] args) {
        String str = "vedant";
        ans(str);
    }
    static void ans(String str){
        str =str.toLowerCase();
        String zero = "0";

        for(char i=0 ; i<str.length(); i++) {
            if (str.charAt(i) == 'a'){
                System.out.print(zero.repeat(i));
            }else if(str.charAt(i) == 'e'){
                System.out.print(zero.repeat(i));
            }else if(str.charAt(i) == 'i'){
                System.out.print(zero.repeat(i));
            }else if(str.charAt(i) == 'o'){
                System.out.print(zero.repeat(i));
            }else if(str.charAt(i) == 'u'){
                System.out.print(zero.repeat(i));
            } else{
                System.out.print(str.charAt(i));
            }





        }



    }
}

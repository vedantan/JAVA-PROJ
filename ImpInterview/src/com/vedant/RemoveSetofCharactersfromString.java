package com.vedant;
//https://www.codingninjas.com/codestudio/library/coderbyte-interview-questions
public class RemoveSetofCharactersfromString {
    public static void main(String[] args) {
        char [] a = {'v','a' ,'z'};
        String b = "vedant";

        find(a , b);

    }

    static void find(char[] a , String b){

        for (int i=0 ; i<b.length() ; i++){
            int j=0;
            if(b.charAt(i) == a[j] ){
                b =  b.substring(1);
                j++;
            }
        }
        System.out.println(b);
    }
}

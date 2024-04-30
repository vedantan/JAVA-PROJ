package com.vedant;

public class ConvertLowerAndUpper {
    public static void main(String[] args) {
        String a = "he is a boy and he love ricke";
        System.out.println(convert(a));
    }

    static String convert(String a){
        int mid = a.length() / 2;
        String lowercase = "";
        String UPPERCASE = "";

        for (int i=0 ; i < mid ; i++){
            lowercase = lowercase + a.charAt(i);
        }

        for (int i=mid ; i<a.length() ; i++){
            UPPERCASE = UPPERCASE + a.charAt(i);
        }

        String l = lowercase.toLowerCase();
        String U = UPPERCASE.toUpperCase();

        return l+U;
    }



}

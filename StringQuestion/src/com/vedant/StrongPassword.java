package com.vedant;
// problem on hackerRank => StrongPassword
public class StrongPassword {
    public static void main(String[] args) {
        String s = "Ab1";
        System.out.println(minimumNumber(s));
    }

    static int minimumNumber( String password) {

        int n = password.length();
        int upper=0,lower=0,digit=0,special=0,v=0;
        for(int i=0;i<password.length();i++)
        {
            char ch=password.charAt(i);
            if(Character.isUpperCase(ch))
                upper++;
            else if(Character.isLowerCase(ch))
                lower++;
            else if(Character.isDigit(ch))
                digit++;
            else
                special++;
        }
        if(upper==0)
            v++;
        if(lower==0)
            v++;
        if(digit==0)
            v++;
        if(special==0)
            v++;
        if(n<=6)
            return Math.max(v,6-n);
        else
            return v;
    }
}

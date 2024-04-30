package com.vedant;

public class StringBasicConcept {
    public static void main(String[] args) {

        String s1 = "Sachin";
        String s2 = "SACHIN";
        String s3 = new String("Sachin");

        s1 = s1.substring(0, 4);
//      returns the value between 0 and 8 (here the 8 is not including)
        System.out.println(s1);


        s1=s1.concat(" Tendulkar");
        System.out.println(s1);

        System.out.println(s2.equals(s3));
        System.out.println(s2.equalsIgnoreCase(s3));


//        Integer.toString()         convert integer to string
//        Integer.parseInt()         convert String to int




    }
}




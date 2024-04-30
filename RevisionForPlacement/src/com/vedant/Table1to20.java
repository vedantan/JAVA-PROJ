package com.vedant;

public class Table1to20 {
    public static void main(String[] args) {
       for (int i=1 ; i<=20 ; i++){
           int temp = i;
           for(int j=1 ; j<=10 ; j++ ){
               System.out.print(temp * j + "  ");
           }
           System.out.println();
       }
    }

}

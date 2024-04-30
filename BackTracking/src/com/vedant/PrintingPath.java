package com.vedant;

public class PrintingPath {
    public static void main(String[] args) {
        printingpath("",3,3);
    }

    static void printingpath(String p , int r, int c){
        if(r == 1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            printingpath(p + 'D',r-1,c);
        }

        if(c>1){
            printingpath(p+'r' , r ,c-1);
        }
    }
}

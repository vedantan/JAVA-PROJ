package com.vedant;

public class Fibo {
    public static void main(String[] args) {

        System.out.println(fibo(7));

        fibo2();


    }
    static int fibo(int n){
        if(n<=2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }

    static void fibo2(){
        int a=0 , b=1;
        System.out.print(a + " " + b + " ");
        for(int i=2 ; i<10 ;i++){
            int c = a+b;

            System.out.print(c + " ");
            a=b;
            b=c;

        }
    }



}

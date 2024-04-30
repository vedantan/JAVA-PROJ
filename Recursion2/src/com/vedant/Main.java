package com.vedant;
// if void then no need to call sout
// n-- is different from --n
// n-- will pass value then subtract
// --n will subtract and then ass the value
public class Main {

    public static void main(String[] args) {
//        fun(5);
//        System.out.println("   ");
//        funrev(5);
//        funboth(5);
        funboth(5);

    }
//    n to 1
    static void fun(int n){
        if(n == 0){
            return;
        }

        System.out.println(n);
        fun(n-1);
    }

//    1 to n
    static void funrev(int n){
        if(n == 0){
            return;
        }
        funrev(n-1);
        System.out.println(n);

    }

//    printing both in one
    static void funboth(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        funboth(n-1);
        System.out.println(n);

    }

    static void fun3(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        fun3(--n);
    }

}

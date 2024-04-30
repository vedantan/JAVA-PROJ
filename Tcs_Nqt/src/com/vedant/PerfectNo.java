package com.vedant;

public class PerfectNo {
    public static void main(String[] args) {
        print(1,100);
    }

    static boolean isperfect(int n){
        int sum=0;
        for (int i=1 ; i<n ;i++){
            if(n%i == 0){
                sum =sum+i;
            }
        }

//        for (int i = 1; i * i <= n; i++) {
//            if (n % i == 0) {
//
//                if (i * i == n || i == 1)
//                    sum = sum + i;
//                else sum = sum + i + n / i;
//
//            }
//        }
        if(sum == n){
            return true;
        }else return false;
    }

    static void print(int min , int max){
        for (int i=min ; i<= max ;i++){
            if(isperfect(i)){
                System.out.print(i + " ");
            }
        }
    }
}

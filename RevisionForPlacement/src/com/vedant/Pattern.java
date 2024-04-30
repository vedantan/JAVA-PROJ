package com.vedant;
import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your number:- ");
        int n = sc.nextInt();
        pattern1(n);
        System.out.println();
        pattern(n);
        System.out.println();
        pattern3(n);
        System.out.println();
        pattern4(n);
        System.out.println();
        pattern5(n);
        System.out.println();
        pattern6(n);
        System.out.println();
        pattern7(n);
//        System.out.println();
        pattern8(n) ;
    }

    static void pattern1(int n){
        for (int i=1 ; i<=n ; i++){
            for (int j=1 ; j<=i-1 ; j++){
                System.out.print("  ");
            }
            for (int j=1 ; j<=n-i+1 ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }



    static void pattern(int n){
        for (int i=1 ; i<=n ; i++){
            for (int j=1 ; j<=n-i+1 ; j++){
                System.out.print(j+" ");
            }
            for (int j=1; j <=i-1 ; j++){
                System.out.print("  ");
            }
            System.out.println();
        }
    }



    static void pattern3(int n){
        for (int i=1 ; i<=n ; i++){
            for (int j=1 ; j<=i ; j++){
                System.out.print(j+" ");
            }
            for (int j=1; j <=n-i ; j++){
                System.out.print("  ");
            }
            System.out.println();
        }
    }


    static void pattern4(int n){
        for (int i=1 ; i<= n ;i++){
            for (int j=1 ; j<=n-i ; j++){
                System.out.print("  ");
            }
            for (int j=1 ; j<=i ; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        for (int i=1 ; i<=n ;i++){
            for (int j=1 ; j<=n-i+1 ; j++){
                System.out.print(j+" ");
            }
            for (int j=1 ; j<=i-1 ; j++){
                System.out.print("  ");
            }

            System.out.println();
        }
    }


    static void pattern6(int n){
        for (int i=1 ; i<=n ;i++){
            for (int j=n-i ; j>=1 ; j--){
                System.out.print(" ");
            }
            for (int j=1 ; j<=i ; j++){
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }

    static void pattern7(int n){
        for (int i=1 ; i<=n ; i++){
            for (int j=n-i ; j>=1 ; j-- ){
                System.out.print(" ");
            }
            for (int j=1 ; j<=i ;j++){
                System.out.print("j ");
            }

            System.out.println();
        }
    }

    static void pattern8(int n){
        for (int i=1 ; i<=n ; i++){
            for (int j=1 ; j<=i-1 ; j++){
                System.out.print(" ");
            }
            for (int j=i-1 ; j<n ; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }

}

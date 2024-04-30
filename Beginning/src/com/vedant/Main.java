package com.vedant;
// printing fibo no from their index value
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a =0;
        int b =1;
        int count = 2;

        while (count<=n){
            int temp = b;
            b = b+a;
            a = temp;
            count++;

        }
        System.out.println(b); // starting from index
        System.out.println(a); // starting from 1



    }
}

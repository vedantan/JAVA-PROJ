package com.vedant;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
        int ans = fun(in.nextInt());
        System.out.println(ans);

    }
    static int fun(int n) {
        int rem ;
        int sum=0;
        while(n>0){
            rem=n%10;
            int cube = rem*rem*rem;
            sum= sum + cube;
//            System.out.println(sum);
            n=n/10;
        }
        return sum;
    }
}

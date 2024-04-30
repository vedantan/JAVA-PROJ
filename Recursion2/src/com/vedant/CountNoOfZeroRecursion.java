package com.vedant;
public class CountNoOfZeroRecursion {
    public static void main(String[] args) {




        System.out.println(count(0,0));

    }

    static int count(int n , int c) {
        if (n == 0) {
            return 1;
        }

        int rem = n % 10;
        if (rem == 0) {
            return count(n/10,c+1);
        }else
            return count(n/10, c);


       }

}


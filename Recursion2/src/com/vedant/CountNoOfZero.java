package com.vedant;

public class CountNoOfZero {
    public static void main(String[] args) {
        int n = 1010000;
        System.out.println(find(n));
    }
    static int find(int n){
        if(n == 0){
            return 1;
        }
        int count =0;
        while (n>0){
            int rem= n%10;
            if(rem == 0){
                count++;
            }
            n = n/10;
        }
        return count;
    }
}

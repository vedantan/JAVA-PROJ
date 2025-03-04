package com.vedant;

public class ReverseANumberRecursion {
    public static void main(String[] args) {
        int n = 1246;
        int ans = rev(n);
        System.out.println(ans);

    }
    static int rev(int n){
//        sometimes you might need some additional variable in the argument
//        in that case , make another function
        int digits = (int) (Math.log10(n))+1;
        return helper(n,digits);
    }

    private static int helper(int n, int digits) {
        if(n%10 == n){
            return n;
        }
        int rem = n%10;
        return rem * (int)Math.pow(10,digits-1) + helper(n/10 , digits-1);
    }


}

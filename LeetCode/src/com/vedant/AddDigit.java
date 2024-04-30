package com.vedant;
//leet code 258
// sum of all the digit
public class AddDigit {
    public static void main(String[] args) {
        int n =326;
        System.out.println(ans(n));
    }
    static int ans(int n){
        int sum =0;
        while (n>0 || sum>9){
            if(n==0){
                n=sum;
                sum=0;
            }
            int rem = n%10;
            sum =sum  + rem;
            n = n/10;
        }
        return sum;
    }
}

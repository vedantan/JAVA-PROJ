package com.vedant;

public class CloserSum {
    public static void main(String[] args) {
        int n = 6874;
        System.out.println(res(n));

    }
    static int res(int n){
        int sum =0;
        String s = "" + n;

        for (int i=0 ; i<s.length()/2 ; i++){
            for (int j=s.length()-1 ; j>= s.length()/2 ; j--){
                int res = s.charAt(i)+s.charAt(j);
                System.out.println(res);
                break;
//                sum= sum+res;
            }
        }
        return sum;
    }
}

package com.vedant;
//O log(n)
public class IsSquareRoot {
    public static void main(String[] args) {
        int n =36;
        int p =2;

        System.out.println(  search(n,p));
    }
    static double search(int n  ,int p) {
        int s = 0;
        int e = n;
        double root = 0.0;

        while (s<=e){
            int m = s + (e-s) /2;
            if(m*m == n ){
                return m;
            }
            if(m*m > n){
                e = m-1;
            }else{
                s = m+1;
            }

            double incr = 0.1;
            for(int i =0 ; i<p ; i++){
                while (root*root  <=n){
                    root = root + incr;
                }
                root = root - incr;
                incr /=10;
            }
        }

       return root;
    }
}

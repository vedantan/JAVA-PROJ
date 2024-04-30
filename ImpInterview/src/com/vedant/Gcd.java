package com.vedant;
public class Gcd {
    public static void main(String[] args) {
        int x = 24;
        int y = 36;
        int z = 48;
        System.out.println(gcd(x,y,z));
    }

    static int gcd(int x , int y,int z){
        int gcdpossible = Integer.MIN_VALUE;
        int ans = 1;
        int n = Math.min(x,y);
        int res = Math.min(n,z);
        for (int i=1 ; i<= res ; i++){
        if(x%i == 0 && y%i == 0 && z%i ==0){
            if(i>gcdpossible){
                ans = i;
            }
        }
    }
        System.out.println("lcm is " + (x*y) / ans);
        return ans;
  }
}

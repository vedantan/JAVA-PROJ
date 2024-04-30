package com.vedant;

public class Amstrong {
    public static void main(String[] args) {
        int n = 132;
        amstrong(132);


    }
    static void amstrong(int n){
        int x = n;
        int sum = 0 ;
        int count = 0;
        while (x>0){
            count++;
            x =x/10;
        }

        int y = n;
        while (y>0){
            int pro =1;
            int rem = y%10;
            for (int i=1 ; i<=count ; i++){
                pro = pro * rem;
            }
            sum = sum+pro;
            y =y/10;
        }

        System.out.println(sum);
    }

}

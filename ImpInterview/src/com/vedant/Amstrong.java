package com.vedant;
public class Amstrong {
    public static void main(String[] args) {
        int a = 153;
        amst(a);
    }

    static void amst(int n){
        int temp = n;
        int sum =0;
        int count =0;
        while (temp>0){
            count++;
            temp=temp/10;
        }

        int x = n;
        while(x>0){
            int digit = x%10;
            int pro = 1 ;
            for(int i=1 ;i<=count ; i++) {
                pro = pro * digit;
            }
            sum = sum+pro;
            x = x/10;
        }

        System.out.println(sum);
       if(sum == n){
           System.out.println("Amstrong no");
       }else{
           System.out.println("Not a Amstrong no");
       }
    }
}
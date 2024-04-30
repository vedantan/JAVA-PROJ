package com.vedant;

import javax.naming.PartialResultException;

public class MissingNo {
    public static void main(String[] args) {
        int[] arr = {3,2,0,1};
        System.out.println(missing(arr));
        System.out.println(missinga(arr));

    }
    static int missing(int[] arr){
        int n = arr.length;
        int sum=0,sum1=0;
        for(int i =1 ;i<=n;i++){
            sum+=i;
        }
        for(int i =0 ;i<n;i++){
            sum1+=arr[i];
        }
        return sum-sum1;

    }

    static int missinga(int[] a){
        int sum1 =0;
        int sum2 =0;

        for(int i=1 ; i<=a.length ;i++){
            sum1 = sum1+i;
        }

        for(int i=0 ; i<a.length ;i++){
            sum2 = sum2+a[i];
        }

        return sum1-sum2;

    }
}

package com.vedant;

import java.util.HashMap;
import java.util.Map;

public class ReverseString {
    public static void main(String[] args) {
        String a = "Vedant";
        rev(a);
        System.out.println(rev1("Nillawar"));
//        System.out.println(find1(1234));
        System.out.println(sum1(1334));

        int[] arr = {10,20,20,10,30,40,50,20};
        System.out.println(findarr(arr,arr.length));

        System.out.println(find2(1334));
    }
    static void rev(String a){
        String b = "";
        for (int i=a.length() -1; i>=0 ; i--){
            b = b + a.charAt(i);

        }
        System.out.println(b);
    }

    static String rev1(String ab){
        String c="";
        for (int i=ab.length()-1 ; i>=0 ; i--){
            c=c+ab.charAt(i);
        }
        return c;
    }




    static int sum1(int n){
        int sum=0;
        int count=0;

        while (n>0 || sum>9){
            if(n == 0){
                n =sum;
                sum = 0;
            }
            sum =sum+(n%10);
            count++;
            n =n/10;
        }
        return count;
    }


    static int findarr(int[] arr ,int n){
        int maxcount =0;
        int element = 0;
        for (int i=0 ; i<arr.length ; i++){
            int count = 0;
            for (int j=0 ; j<arr.length ; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count > maxcount){
                maxcount =count;
                element =arr[i];
            }
        }
        return element;
    }


    static int find2(int n){
        int count =0;
        while (n /10 != 0){
            int x=0;
            while (n>10){
                int ld = n%10;
                x=x+ld;
                n = n/10;

            }
            n = x;
            count++;

        }
        return count;
    }



}

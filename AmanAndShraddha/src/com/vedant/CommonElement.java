package com.vedant;

import java.util.Arrays;

public class CommonElement {
    public static void main(String[] args) {
        int[] a = {1,5,5};
        int[] b = {3,4,5,5,10};
        int[] c = {5,5,10,20};



        find(a,b,c);
    }

    static void find(int[] a ,int[] b , int[] c){
        if(a.length == 0){
            System.out.println("no common element found");
        }

        int i=0 , j=0 ,k=0 ;
        while(i<a.length && j<b.length && k<c.length){
            if(a[i] == b[j] && b[j] == c[k]){
                System.out.println(a[i]);
                i++;
                j++;
                k++;
            }else if(a[i] < b[j]){
                i++;
            }else if(b[j] < c[k]){
                j++;
            }else{
                k++;

            }
        }



    }

}

package com.vedant;

public class Sorted {
    public static void main(String[] args) {
        int[] a = {2,4,6};

        boolean issorted = true;
        for(int i =0 ; i< a.length-1 ; i++){
           if(a[i] > a[i+1]){
               issorted = false;
           }

        }

        if(issorted){
            System.out.println("The array is sorted");
        }else{
            System.out.println("the array is not sorted");
        }
    }
}

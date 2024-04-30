package com.vedant;
import java.util.Arrays;

// Question no 2
public class Reverse {
    public static void main(String[] args) {
        int[] arr = {4,5,1,2,5,3,8,1};
        int[] a = new int[arr.length];
        System.out.println(Arrays.toString(reverse(arr,a)));

        reversestr("" , "Vedant");
    }
    static int[] reverse(int[] arr , int[] a){
        a = new int[arr.length];

        for(int i=0 ; i< arr.length ;i++){
            a[i] = arr[arr.length-1-i];
        }
        return a;
    }

    static void reversestr(String p ,String up){
        for(int i = up.length() -1 ; i>=0 ; i--){
            char c = up.charAt(i);
            p =  p +c;
        }

        System.out.println(p);
    }
}

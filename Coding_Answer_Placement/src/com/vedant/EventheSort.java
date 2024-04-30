package com.vedant;

import java.util.Arrays;

public class EventheSort {
    public static void main(String[] args) {
        int[] a = {12,0,7,6,0,32,43};
        System.out.println(Arrays.toString(find(a)));
    }

    static int[] find(int[] a){
        Arrays.sort(a);
        int count = 0;
        for (int i=0 ; i<a.length ; i++){
            if(a[i]%2 == 0 || a[i] == 0){
                count++;
            }
        }
        System.out.println(count);
        int[] b = new int[count];
        int cout = count;
        int j=0;
        for (int i=0 ; i< a.length ; i++){
            if(a[i]%2 == 0  && a[i] != 0){
                b[j] = a[i];
                j++;
            }
        }

        return b;
    }

}

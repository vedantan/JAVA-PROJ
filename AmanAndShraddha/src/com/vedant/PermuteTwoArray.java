package com.vedant;

import java.util.Arrays;
import java.util.Collections;

public class PermuteTwoArray {
    public static void main(String[] args) {
        Integer [] a = {2,1,3};
        int[] b = {7,8,9};

        System.out.println(sum(a,b,10));

    }
    static boolean sum(Integer [] a ,int[] b , int target){

        Arrays.sort(a, Collections.reverseOrder());
        Arrays.sort(b);

        for(int i=0 ; i<a.length ; i++){
            if(a[i] + b[i] < target){
                return false;
            }

        }
        return true;
    }
}

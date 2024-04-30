package com.vedant;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PositivemissingNo {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,2,6};
        findmissing(arr);
    }

    static void findmissing(int[] arr){
        Set<Integer> set = new HashSet<>();


        for(int i=0 ; i<arr.length ;i++){
            if(set.contains(arr[i])){
                System.out.println("The repeating element is " + arr[i]);
            }else{
                set.add(arr[i]);
            }

        }

        for(int i=1 ; i< arr.length ;i++){
            if(!set.contains(i)){
                set.add(i);
                System.out.println("The missing element is " + i);
            }
        }

        System.out.println(set);

    }
}




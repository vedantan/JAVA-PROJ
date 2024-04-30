package com.vedant;

import java.util.ArrayList;
import java.util.List;

public class AllDisappered{
    public static void main(String[] args) {
        int[] arr = {1,3,5};
        System.out.println(allDisappered(arr));

    }
    static List<Integer> allDisappered(int [] arr){
        int i =0;

        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int index = 0; index < arr.length ; index++){
            if(arr[index] != index +1 ){
                ans.add(index+1);
            }
        }
        return ans;
    }

    static void swap(int [] arr , int start , int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}


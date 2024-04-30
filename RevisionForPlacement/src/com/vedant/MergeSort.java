package com.vedant;
import java.util.Arrays;
public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {6,5,4,2,1};
        System.out.println(Arrays.toString(merge(arr)));
    }

    static int[] merge(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = merge(Arrays.copyOfRange(arr,0,mid));
        int[] right = merge(Arrays.copyOfRange(arr,mid,arr.length));

        return solution(left,right);
    }

    static int[] solution(int[] left , int[] right){
        int i=0 ;
        int j=0 ;
        int k=0;

        int[] mix = new int[left.length + right.length];

        while(i < left.length && j < right.length){
            if(left[i] < right[j]){
                mix[k] = left[i];
                i++;
            }else{
                mix[k] = right[j];
                j++;
            }
            k++;
        }

        while(i < left.length){
            mix[k] = left[i];
            i++;
            k++;
        }

        while(j < right.length){
            mix[k] = right[i];
            j++;
            k++;
        }

        return mix;
    }

}

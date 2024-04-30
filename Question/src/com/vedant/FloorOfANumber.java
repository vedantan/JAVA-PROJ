package com.vedant;
// Floor of a number question
import java.util.Scanner;
public class FloorOfANumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {3,5,9,14,16,18};
        int target = in.nextInt();
        System.out.println(find(arr,target));

    }
    static int find(int[] arr , int target){

        int start =0 ;
        int end = arr.length - 1 ;
        while(start<=end){
            int mid = start + ((end - start) / 2 );
            if(target < arr[mid]){
                end = mid - 1;
            }else if (target > arr[mid]){
                start = mid +1 ;
            }else{
                return  mid;
            }
        }
        return end;
    }
}

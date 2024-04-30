package com.vedant;

import java.util.Scanner;

public class LinearSearch3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {9,7,8,45,26,45,24,75};

        int target = in.nextInt();
        int ans = LinearSearch2(arr,target);
        System.out.println(ans);

    }

    static int LinearSearch2(int[] arr , int target){
        if(arr.length == 0){
            return -1;
        }

        for(int i = 0 ; i< arr.length ; i++){
            int element = arr[i];
            if(element==target){
                return i;
            }
        }
        return -1;

    }
}

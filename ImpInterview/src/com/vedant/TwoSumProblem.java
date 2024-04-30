package com.vedant;
//https://www.codingninjas.com/codestudio/library/coderbyte-interview-questions
public class TwoSumProblem {
    public static void main(String[] args){
        int [] arr = {1,2,3,4,5,6};
        int a = 11;

        System.out.println(find(arr,a));

    }

    static int find(int[] arr , int a){
        int count =0;
        for (int i=0 ; i<arr.length ; i++){
            for (int j=1 ; j<arr.length ;j++){
                if(a == arr[i] + arr[j]){
                    return count+1;
                }
            }
        }

        return 0;

    }


}

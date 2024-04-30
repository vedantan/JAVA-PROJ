package com.vedant;

import java.util.HashSet;

public class CountTheTriplets {
    public static void main(String[] args) {
        int[] arr = {2, 3,7, 4,5};
        System.out.println(find(arr));
    }
//    static int find(int[] arr){
//        int count =0;
//
//        HashSet<Integer> map = new HashSet<>();
////        for(int i =0 ; i< arr.length ; i++){
////            map.add(arr[i]);
////        }
//
//        for(int x: arr){
//            map.add(x);
//        }
//
//        for(int i=0 ; i< arr.length ; i++){
//            for(int j =i+1 ; j< arr.length ; j++){
//                if(map.contains(arr[i] + arr[j])){
//                    count++;
//                }
//            }
//        }
//        return count;
//    }

    static int find(int[] arr){
        int count =0;
        HashSet<Integer> map = new HashSet<>();
        for(int x: arr){
            map.add(x);
        }

        for (int i=0 ; i<arr.length ; i++){
            for (int j=0 ; j<arr.length ;j++){
                if(map.contains(arr[i] + arr[j])){
                    count++;
                }
            }
        }
        return count;
    }
}

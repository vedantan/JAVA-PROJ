package com.vedant;
// print max and min in the array
public class Maximum {
    public static void main(String[] args) {
        int[] a = {234,66,-785,8864, -964 ,0 ,-3639};
//        int max = Integer.MIN_VALUE;
//
//        for(int i=0 ; i < a.length ; i++ ){
//            if(a[i] > max){
//                max = a[i];
//            }
//        }
//        System.out.println(max);


        int min = Integer.MAX_VALUE;
        for(int i =0 ; i<a.length ; i++){
            if(a[i] < min){
                min = a[i];
            }
        }
        System.out.println(min);
    }
}

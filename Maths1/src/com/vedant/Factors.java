package com.vedant;

import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
         factor1(36);
//        factor2(36);
    }
    static void factor1(int n){
        for(int i=1 ; i<=n ; i++){
            if(n % i == 0){
                System.out.print(i + " ");
            }
        }
    }


//    static void factor2(int n){
//        ArrayList<Integer> list = new ArrayList<>();
//        for(int i =1 ; i<=Math.sqrt(n) ; i++){
//            if(n%i == 0){
//                if(n%i == i){
//                    System.out.println(i + " ");
//                }else{
//                System.out.println(i +" " );
//                list.add(n/i);
//            }
//
//            }
//        }
//        for(int i = list.size() -1 ; i>=0 ; i--){
//            System.out.print(list.get(i) + " ");
//        }
//    }
}

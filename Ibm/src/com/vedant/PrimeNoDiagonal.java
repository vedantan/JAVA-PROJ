package com.vedant;
import java.util.ArrayList;
public class PrimeNoDiagonal {
    // https://leetcode.com/discuss/interview-question/3071161/IBM-TEST-CODE-KNACK-QUESTION-2023oror-NOT-SOLVEDororHELPororIBM-Interview-experience
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 3, 2},
                {7, 8, 19}
        };

        System.out.println(findDiagonal(arr));
    }

    static ArrayList<Integer> findDiagonal(int[][] arr) {
        ArrayList<Integer> list = new ArrayList<>();

        //primary diagonal
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i][i]);
        }

        //secondary diagonal
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                int n = arr.length;
//              row = numberOfRows - column -1
                if ((i + j) == (n - 1)) {
                    list.add(arr[i][j]);
                }
            }
        }
//        for (int i=0 ; i<arr.length ; i++){
//            list.add(arr[arr.length-i-1][i]);
//        }


        //list to array
        Integer[] array = list.toArray(new Integer[0]);

        int ans = Integer.MIN_VALUE;
        for (int num : array) {
            if (find(num) && num > ans) {
                ans = num;
            }
        }
        System.out.println(ans);
        return list;
    }

    static boolean find(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }
}





























//    static void findprime(int a){
//        if(a<=3 && a!=1){
//            System.out.println(a);
//        }
//
//        for (int i=4 ; i<list.size() ;i++){
//            if(a%i == 0){
//                System.out.println(a);
//            }
//        }
//
//
//    }
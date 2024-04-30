package com.vedant;

public class CheckweatherAllelementsinArrayareSAme {
    public static void main(String[] args) {
        int[] arr = {5,5,5,5,5};

        find(arr);
    }

    static void find(int[] arr){
        if(issame(arr)){

            for(int i=0 ; i<arr.length ;){
                System.out.println(arr[i]);
                System.out.println(arr.length-1);
                System.out.println( (arr[i]) * (arr.length-1) + " " + (arr[i]) * (arr.length-1));
                break;
            }

        }
    }
    static boolean issame(int[] arr){
        for (int i=0 ; i<arr.length-1 ;i++){
            if(arr[i] != arr[i+1]){
                return false;
            }
        }
        return true;
    }
}

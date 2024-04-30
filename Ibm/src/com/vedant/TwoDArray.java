package com.vedant;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] arr = { {1,2,3,4,6,7},
                        {4,0,9,8,7,9},
                        {7,8,9,11,12,3}};
        int a =11;
        find(arr,a);
    }

    static void find(int[][] arr , int a){
        for (int i=0 ; i<arr.length ;i++){
            for (int j=0 ; j<arr[0].length ; j++){
                if(arr[i][j] == a){
                    System.out.print("the element in the rows are=> ");

                    for (int z=0 ; z<j ; z++){
                        System.out.print( arr[i][z] + " " );
                    }
                    System.out.println();
                    System.out.print("the element in the columns are=> " );

                    for (int y=0 ; y<i ;y++){
                        System.out.print( arr[y][j] + " ");
                    }
                }
            }
        }
    }
}

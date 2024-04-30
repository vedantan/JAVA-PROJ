package com.vedant;

public class Add2Matrix {
    public static void main(String[] args) {
        int[][] a = {  {1,2,3},
                       {4,5,6} };

        int[][] b = {{7,9,2},
                     {4,9,5}};

        int [][] ans = {{0,0,0},
                        {0,0,0}};


        for(int i=0 ; i<a.length ; i++){
            for(int j =0 ; j < a[i].length ; j++){
                System.out.format("setting the value for i = %d , j=%d\n  " ,i ,j);
                ans[i][j] = a[i][j] + b [i][j];
            }

        }


        for(int i=0 ; i<a.length ; i++){
            for(int j =0 ; j < a[i].length ; j++){
                System.out.print(ans[i][j] + " ");
                ans[i][j] = a[i][j] + b [i][j];
            }
            System.out.println("");
        }
    }
}

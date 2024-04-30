package com.vedant;
// counting path of matrix
public class CountPath {
    public static void main(String[] args) {
        System.out.println(matrix(3,3));
    }

    static int matrix(int r ,int c){
        if(r == 1 || c ==1 ){
            return 1;
        }
        int down = matrix(r-1 ,c);
        int right = matrix(r ,c-1);
        return down+right;
//        return matrix(r-1 , c)+matrix(r,c-1);
    }

}

package com.vedant;
// counting path of maze
public class Main {

    public static void main(String[] args) {
        System.out.println(path(3,3));

    }
    static int path(int r, int c){
        if( r==1 || c==1 ){
            return 1;
        }

        int lower = path(r-1 , c);
        int right = path(r,c-1);
        return lower+right;
    }
}

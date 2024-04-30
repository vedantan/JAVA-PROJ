package com.vedant;

import java.util.ArrayList;

public class PrintingPathwithDiagonal {
    public static void main(String[] args) {
        System.out.println(maze("" , 3,3));
    }
    static ArrayList<String> maze(String p , int r , int c){
        if(r==1 && c == 1){
            ArrayList<String> list = new ArrayList<String>();
            list.add(p);
            return list;

        }

        ArrayList<String> ans = new ArrayList<>();

        if(r>1 && c>1){
            ans.addAll(maze(p+'D' , r-1 ,c-1));

        }
        if(r>1 ){
            ans.addAll(maze(p+'d' , r-1 ,c));

        }
        if(c>1 ){
            ans.addAll(maze(p+'R' , r ,c-1));

        }

        return ans;

    }
}

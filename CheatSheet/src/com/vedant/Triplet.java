package com.vedant;

import com.sun.source.doctree.SeeTree;

import java.util.HashSet;
import java.util.Set;

public class Triplet {
    public static void main(String[] args) {
        int [] a = {-1,0,1,2,-1,4};
        find(a);
    }
    static void find(int [] a){


        for(int i =0 ; i< a.length ; i++){
            for(int j=i+1; j< a.length ;j++){
                for(int k =j+1 ; k<a.length ; k++){
                if(a[i] + a[j] +a[k] == 0){
                    System.out.println(a[i]+" "+a[j]+" "+a[k]);

                }

                }
            }

        }

        }
}

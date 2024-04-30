package com.vedant;

import com.sun.jdi.connect.Connector;

public class SearchinRotated {
    public static void main(String[] args) {
        int[] a = {4,5,6,7,0,1,2} ;
        int tar = 0;
        System.out.println(find(a,tar));
    }
    static int find(int[] a , int tar ){
        int s=0;
        int e =a.length -1;

        while (s<=e){
            int mid = (s+e)/2;
            if(a[mid] == tar){
                return mid;
            }

            if(a[s]< a[mid]){
              if(tar >= a[s] && tar < a[e]){
                  e = mid-1;
              }else{
                  s = mid+1;
              }
            }

            else{
                if(tar > a[mid] && tar <= a[e]){
                    s = mid+1;
                }else{
                    e = mid-1;
                }

            }
        }
        return -1;
    }
}

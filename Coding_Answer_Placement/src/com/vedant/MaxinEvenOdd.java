package com.vedant;

public class MaxinEvenOdd {
    public static void main(String[] args) {
        int[] a = {7,2,3,5,8};
        find(a);

    }
    static void find(int[] a){
        int add = 0;
        int add1 = 0;
        for (int i=0 ; i<a.length ; i++){
            if(i%2 != 0){
                add = add+a[i];
            }else if(i%2 == 0){
                add1 = add1 + a[i];
            }
        }
        int ans = Math.max(add,add1);
        System.out.println(ans);
    }
}

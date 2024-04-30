package com.vedant;

import java.util.Scanner;

public class NoWithMaximunOccurances {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x ={37,832,122,23232,6017};
        System.out.print("please enter the value :- ");
        int y = sc.nextInt();
        findocc( x , y);
//        System.out.println(count1(222,2));

    }
    static void findocc(int[] arr, int y){
        int ans = arr[0];
        int a = count1(arr[0] ,y);

        for (int i=1 ; i<arr.length ; i++){
            if(count1(arr[i],y) > a){
                ans = count1(arr[i] , y);
            }
            //           System.out.println(count1(arr[i],y));
       }
        System.out.println(arr[ans]);

    }

    static int count1(int i , int x){
        int count = 0;
        while (i>0){
            int rem = i%10;
            i = i/10;
            if(rem == x){
             count++;
            }
        }
        return count;
    }
}

package com.vedant;

import java.util.Scanner;

public class NoAtUnitPlace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Start--> ");
        int start = sc.nextInt();
        System.out.println("Enter end--> ");
        int end = sc.nextInt();
        System.out.println("Enter target--> ");
        int target = sc.nextInt();

        System.out.println(find(start,end,target));
    }
    static int find(int s , int e , int target){
        int count = 0;
        for (int i=s ; i<=e ; i++){
            int temp = i%10;
            if(temp == target){
                count++;
            }
        }
        return count;
    }
}

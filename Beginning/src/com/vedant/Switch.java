package com.vedant;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruits = in.next();

        switch (fruits){
            case "mango":
                System.out.println("round fruit");

            case "grapes":
                System.out.println("small fruit");
                break;
            default:
                System.out.println("enter valid fruit");
        }


    }
}

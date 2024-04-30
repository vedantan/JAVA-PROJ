package com.vedant;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        guss(1);

	    }

        static void guss(int n){
            Scanner in = new Scanner(System.in);
            for(int i =0 ; i<5 ; i++){
                System.out.println("enter a no : " );
                n = in.nextInt();

                if(n == 1){
                    System.out.println("you are placed");
                    break;

                }else{
                    System.out.println("enter another no , your no is wrong  now you have  " +  (4-i)  + " chances are remaining" );
                }
            }

        }
}

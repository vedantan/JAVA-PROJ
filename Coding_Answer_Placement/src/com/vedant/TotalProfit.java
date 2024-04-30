package com.vedant;
// qestion based on formula   ---->   ((amt*100*(x+y)) / ((100-c)*x))
import java.util.Scanner;

public class TotalProfit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of amt- ");
        int amt  = sc.nextInt();
        System.out.println("Enter value of x- ");
        int  x  = sc.nextInt();
        System.out.println("Enter value of y- ");
        int  y  = sc.nextInt();
        System.out.println("Enter value of c- ");
        int  c = sc.nextInt();
        System.out.println(find(amt,x,y,c));
    }

    static int find(int amt , int x ,int y ,int c){
        int ans  = ((amt*100*(x+y)) / ((100-c)*x)) ;
        return ans;
    }
}

//package com.vedant;
//
//import java.util.Scanner;
//
//public class Tree2 {
//    static Scanner sc =null;
//    public static void main(String[] args) {
//            sc =   new Scanner(System.in);
//            NODE root = createtree();
//
//        System.out.println(height(root));
//    }
//
//    static int height(NODE root){
//        if(root == null){
//            return 0;
//        }
//
//        return Math.max(height(root.left) , height(root.right) + 1);
//    }
//
//
//
//    static NODE createtree(){
//        NODE root = null;
//        System.out.println("Enter the data ");
//        int data  = sc.nextInt();
//
//        if(data == -1){
//            return null ;
//        }
//
//        root = new NODE(data);
//        System.out.println("enter for left :" + data);
//        root.left = createtree();
//        System.out.println("enter for right :" + data);
//        root.right = createtree();
//
//        return root;
//    }
//
//
//}
//class NODE{
//    NODE left , right;
//    int data ;
//     public NODE(int data){
//       this.data = data;
//     }
//}

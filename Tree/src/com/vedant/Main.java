package com.vedant;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        Node root = createtree();

        inorder(root);
        System.out.println(" ");
        preorder(root);
        System.out.println(" ");
        postorder(root);



    }


    static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data);
        inorder(root.right);
    }

    static void preorder(Node root){
        if(root == null){
            return;
        }

        System.out.print(root.data);
        inorder(root.left);
        inorder(root.right);
    }

    static void postorder(Node root){
        if(root == null){
            return;
        }


        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data);
    }

    static Node createtree(){
        Scanner sc = new Scanner(System.in);
        Node root = null;
        System.out.println("enter the data");
        int data = sc.nextInt();
        if(data == -1){
            return null;
        }

        root = new Node(data);
        System.out.println("Enter for left " + data);
        root.left = createtree();

        System.out.println("Enter for Right " + data);
        root.right = createtree();


        return root;
    }


}

class Node {
    Node left, right;
    int data;
    public Node (int data){
        this.data = data;
    }
}

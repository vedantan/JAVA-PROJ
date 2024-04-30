package com.vedant;

import java.util.ArrayList;

public class TreeToDll extends Main {
    public static void main(String[] args) {
        Node root = createtree();
        converttreetodll(root);
    }

    static  Node head = null , prev = null;
    static void converttreetodll(Node root){

        if(root == null){
            return ;
        }

        converttreetodll(root.left);

        if(root.left == null){
           head = root;
        }else {
            root.left = prev;
            prev.right = root;
        }
        prev = root;

        converttreetodll(root.right);
    }
}

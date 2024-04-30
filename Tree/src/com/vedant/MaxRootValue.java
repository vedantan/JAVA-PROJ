package com.vedant;

public class MaxRootValue extends Main {
    public static void main(String[] args) {
        Node root = createtree();
        System.out.println(maxnode(root));
    }

    static int maxnode(Node root){
        if(root == null){
            return Integer.MIN_VALUE;
        }

        return Math.max(root.data , Math.max(maxnode(root.left) , maxnode(root.right)));


    }
}


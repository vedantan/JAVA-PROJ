package com.vedant;

public class Height extends Main {
    public static void main(String[] args) {
        Node root = createtree();

        System.out.println(height(root));
    }
    static int height(Node root){
        if(root == null){
            return 0;
        }

       return Math.max(height(root.left) +1  , height(root.right) +1) ;
    }
}


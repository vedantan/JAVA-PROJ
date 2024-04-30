package com.vedant;

public class Size extends Main {
    public static void main(String[] args) {
        Node root = createtree();
        System.out.println(size(root));
    }
    static int size(Node root){
        if(root == null){
            return 0;
        }

        return size(root.left)+size(root.right)+1;
    }
}

package com.vedant;

import java.util.ArrayList;
import java.util.Arrays;

public class LeftView extends Main {
    public static void main(String[] args) {
        Node root = createtree();
        System.out.print("Left View -> ");
        leftview(root);
        System.out.println();
        System.out.print("Right view is -> ");
        rightview(root);
    }
    static void leftview(Node root){
        ArrayList<Node> list = new ArrayList<>();
        printleftview(root , list ,0);

        for(Node curr : list){
            System.out.print(curr.data + " ");
        }
    }

    static void printleftview(Node root , ArrayList list , int level){
        if(root == null){
            return;
        }

        if(level == list.size()){
            list.add(root);
        }

        printleftview(root.left , list , level+1);
        printleftview(root.right ,list , level+1);
    }

    static void rightview(Node root){
        ArrayList<Node> list = new ArrayList<>();
        printrightview(root , list , 0 );

        for(Node curr :list){
            System.out.print(curr.data + " ");
        }

    }

    static void printrightview(Node root , ArrayList list , int lev){
        if(root == null){
            return;
        }

        if(lev == list.size()){
            list.add(root);
        }

        printleftview(root.right , list,lev+1);
        printleftview(root.left , list , lev+1);

    }
}



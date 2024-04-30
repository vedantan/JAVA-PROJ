package com.vedant;

import java.util.*;

public class Tree {
    static Scanner sc = null;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Node root = createTree();

        System.out.println();


//   1    inOrder(root);
//        System.out.println();            // traversal in the tree
//
//        preOrder(root);
//        System.out.println();
//
//        postOrder(root);
//        System.out.println();


//    2   System.out.println("the height is " + height(root));  // height of tree

//    3   System.out.println("the maximum node is " + maximun(root));   // maximum node in the tree

//    4   System.out.println("the size of tree is  " + size(root));     // total node in the tree

//    5     levelordertraversal(root);                                  // level wise nodes

//    6    levelorderTransversal(root);                               // level wise nodes line by line

//    7    printleftview(root);
    }

    // 3types if traversal
//   1  static void inOrder(Node root){
//        if(root == null ){
//            return;
//        }

//        inOrder(root.left);
//        System.out.println(root.data);
//        inOrder(root.right);
//
//    }
//
//    static void preOrder(Node root){
//        if(root == null ){
//            return;
//        }
//        System.out.println(root.data);
//        preOrder(root.left);
//        preOrder(root.right);
//
//    }
//
//    static void postOrder(Node root){
//        if(root == null ){
//            return;
//        }
//
//        postOrder(root.left);
//        postOrder(root.right);
//        System.out.println(root.data);
//
//    }

    // heigth of the tree
//    2  static int height(Node root){
//        if(root == null){
//            return 0;
//        }
//
//        return Math.max(height(root.left) +1 , height(root.right)  + 1 );
//    }


    // maximum node in the tree
//  3   static int maximun(Node root){
//        if(root == null){
//            return 0;
//        }
//        return Math.max(root.data, Math.max(maximun(root.left) , maximun(root.right)));
//     }


    // size of the tree
//   4  static int size(Node root){
//        if(root == null){
//            return 0;
//        }
//        return size(root.left) + size(root.right) + 1;
//    }


    // level wise nodes
//  5  static void levelordertraversal(Node root){
//        Queue<Node> q = new LinkedList<>();
//        q.add(root);
//        while(!q.isEmpty()){
//            Node  curr = q.poll();
//            System.out.print(curr.data + " ");
//            if(curr.left != null){
//                q.add(curr.left);
//            }
//            if(curr.right != null){
//                q.add(curr.right);
//            }
//        }
//    }


//   6 static void levelorderTransversal(Node root){
//        Queue<Node> q = new LinkedList<>();
//        q.add(root);
//        q.add(null);
//
//        while (!q.isEmpty()){
//            Node curr = q.poll();
//            if(curr == null){
//                if(q.isEmpty()){
//                    return;
//                }
//                q.add(null);
//                System.out.println();
//                continue;
//            }
//            System.out.print(curr.data + "  ");
//            if(curr.left != null){
//                q.add(curr.left);
//            }
//            if(curr.right != null){
//                q.add(curr.right);
//            }
//        }
//    }


//    7  static void printleftview(Node root){
//        ArrayList<Node> list = new ArrayList<Node>();
//        printleftviewutil(root , list ,0);
//        for( Node curr : list){
//            System.out.print(curr.data + " ");
//        }
//    }
//    static void printleftviewutil(Node root , ArrayList list , int level){
//        if(root == null){
//            return;
//        }
//        if(list.get(level) == null){
//            list.add(root);
//        }
//        printleftviewutil(root.left,list,level+1);
//        printleftviewutil(root.right,list,level+1);
//    }

//   7  static class Depth {
//        int d;
//       public Depth(int d) {
//            this.d = d;
//        }
//    }
//
//    static int mintime(Node root, int target) {
//        Depth depth = new Depth(-1);
//        burn(root, target, depth);
//        return ans;
//    }
//
//    static int ans = -1;
//
//    static int burn(Node root, int target, Depth depth) {
//        if (root == null) {
//            return 0;
//        }
//        if (root.data == target) {
//            depth.d = 1;
//            return 1;
//        }
//
//        Depth ld = new Depth(-1);
//        Depth rd = new Depth(-1);
//
//        int ld = burn(root.left, target, ld);
//        int rd = burn(root.right, target, rd);
//
//        if (ld != -1) {
//            ans = Math.max(ans, ld.d + 1 + rd);
//            depth.d = ld.d + 1 + rd;
//        } else if {
//            ans = Math.max(ans, ld + 1 + rd.d);
//            depth.d = ld + 1 + rd.d;
//        }
//
//        return Math.max(lh, rh) + 1;
//    }

    static boolean same(Node p, Node q){
        if(p == null || q == null){
            return p==q;
        }
       return (p.data == q.data) && same(p.left , q.left) && same(q.right ,q.right);
    }


    static Node createTree(){
        Node root = null;
        System.out.println("enter the data ");
        int data = sc.nextInt();
        if(data == -1){
            return null;
        }
        root = new Node(data);
        System.out.println("enter for left  : " + data);
        root.left = createTree();
        System.out.println("enter for right  : "  +  data);
        root.right = createTree();

        return root;
    }
}

class Node{
    Node left , right;
    int data;

    public Node(int data){
        this.data = data;
    }
}
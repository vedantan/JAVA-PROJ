package com.vedant;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder extends Main{
    public static void main(String[] args) {
        Node root = createtree();
        level(root);
    }
    static void level(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
           Node curr = q.poll();

            System.out.print(curr.data);

            if(curr.left != null){
                q.add(curr.left);
            }

            if(curr.right != null){
                q.add(curr.right);
            }

        }
    }
}

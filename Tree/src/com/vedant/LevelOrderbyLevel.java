package com.vedant;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderbyLevel extends Main {
    public static void main(String[] args) {
        Node root = createtree();

        printbylevel(root);
    }
    static void printbylevel(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()) {
            Node curr = q.poll();
            if (curr == null) {
                if(q.isEmpty()){
                    return;
                }
                q.add(null);
                System.out.println();
                continue;
            }

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

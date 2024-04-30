package com.vedant;

public class Diameter extends  Main{
    public static void main(String[] args) {
        Node root = createtree();
        System.out.println(dia(root));

    }

        static int ans =0 ;
        static int dia(Node root) {
            dfs(root);
            return ans;
        }

        static int dfs(Node root){
        if(root == null){
            return 0;
        }

        int left = dfs(root.left);
        int right = dfs(root.right);
        ans = Math.max(ans , left+right);
        return 1 + Math.max(left , right);


    }
}

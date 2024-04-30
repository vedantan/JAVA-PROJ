package com.vedant;

import java.util.LinkedList;
import java.util.Scanner;

public class Graph2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no of vertices and edeges");
        int v = in.nextInt();
        int e = in.nextInt();

        Graph2 graph = new Graph2(v);
        System.out.println("enter  " + e + "  edeges");
        for(int i =0 ; i<e ;i++){
            int source = in.nextInt();
            int destination = in.nextInt();

            graph.addedege(source,destination);
        }

        System.out.println("enter source and destination");

        int source =in.nextInt();
        int destination = in.nextInt();
        System.out.println("possible");




    }


    private boolean dfsutil(int source ,int destination ,boolean vis[]){
        if(source == destination ){
            return  true;
        }

        for(int neighbour : adj[source]){
            if(!vis[neighbour]){
                vis[neighbour] = true;
                boolean isconnected = dfsutil(neighbour , destination ,vis);
                if(isconnected){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean dfs(int source ,int destination){
        boolean vis[] = new boolean[adj.length];
        vis[source] = true;
        return  dfsutil(source,destination,vis);
    }





    private LinkedList<Integer> adj[];
    public Graph2(int v){
        adj = new LinkedList[v];
        for(int i =0 ; i< v ; i++){
            adj[i] = new LinkedList<>();
        }
    }

    public void addedege(int source , int destination){
        adj[source].add(destination);
        adj[destination].add(source);
    }

}

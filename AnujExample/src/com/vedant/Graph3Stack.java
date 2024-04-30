package com.vedant;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Graph3Stack {
    public static void main(String[] args) {
        System.out.println("enter the vertices and edges");
        Scanner in = new Scanner(System.in);
        int v = in.nextInt();
        int e =  in.nextInt();

        Graph3Stack graph = new Graph3Stack(v);
        System.out.println("enter  "+ e + "edges");
        for(int i =0 ; i<e ;i++){
            int source = in.nextInt();
            int destination = in.nextInt();
            Graph3Stack.addedege(source,destination);
        }
        System.out.println("enter source and destination");
        int source =in.nextInt();
        int destination = in.nextInt();
        System.out.println("possible");
    }
    static boolean dfsstack(int source ,int destination){
        boolean [] vis =new boolean[adj.length];
        vis[source] = true;
        Stack<Integer> s = new Stack<>();
        s.push(source);
        while(! s.isEmpty()){
            int curr = s.pop();
            if(curr == destination){
                return true;
            }
             for(int neighbour : adj[curr]){
                 if(!vis[neighbour]){
                     vis[neighbour] = true;
                     s.push(neighbour);
                 }
             }
        }
        return false;
    }


    private static LinkedList<Integer> adj[];
    private  Graph3Stack(int v){
        adj = new LinkedList[v];
        for(int i =0 ; i<v ; i++){
            adj[i] = new LinkedList<>();
        }
    }
     private static void addedege(int source, int destination){
        adj[source].add(destination);
        adj[destination].add(source);

     }
}

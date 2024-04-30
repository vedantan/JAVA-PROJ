package com.vedant;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Graph {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int v = in.nextInt();
        int e = in.nextInt();

        Graph graph = new Graph(v);
        System.out.print("enter "   + e + " edges");
        for(int i =0 ; i<e ;i++){
            int source = in.nextInt();
            int destination = in.nextInt();

            graph.addedege(source,destination);
        }
        System.out.println("enter source and destination");

        int source = in.nextInt();
        int destination = in.nextInt();

        int dis = Graph.bfs(source,destination);
        System.out.println("min distance is   " + dis );
        in.close();
    }


    static int bfs(int source , int destination){
        boolean [] vis = new boolean[adj.length];
        int [] parent = new int[adj.length];
        Queue<Integer>  q = new LinkedList<>();

        q.add(source);
        parent[source] = -1;
        vis[source] = true;


        while(!q.isEmpty()){
            int curr = q.poll();
            if(curr == destination){
                break;
            }

            for(int neighbour : adj[curr]){
                if(!vis[neighbour]){
                    vis[neighbour] = true;
                    q.add(neighbour);
                    parent[neighbour] = curr;
                }
            }
        }
        int cur = destination;
        int dis =0 ;
        while(parent[cur] != -1){
            System.out.print(cur + " -> ");
            cur = parent[cur];
             dis++;
        }

        return dis;
    }



    private static LinkedList<Integer> adj[];
    private  Graph(int v){
        adj = new LinkedList[v];
        for(int i=0 ; i<v ; i++){
            adj[i] =new LinkedList<Integer>();
        }
    }

    private void addedege(int source , int destinition){
        adj[source].add(destinition);
        adj[destinition].add(source);
    }
}

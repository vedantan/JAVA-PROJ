package com.vedant;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.Scanner;

public class Graph_implementation {
    private class LinkedList<Integer> adjacency[];


        public Graph_implementation(int v) {
            adjacency = new LinkedList[v];
            for (int i = 0; i < v; i++) {
                adjacency[i] = LinkedList < Integer > ();
            }
        }

        public void insertedge(int s, int d) {

            adjancency[s].add(d);
            adjancency[d].add(s);
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of Vertices and Edges");
        int v = sc.nextInt();
        int e = sc.nextInt();
        Graph_implementation g = new Graph_implementation(v);
        System.out.println("Enter edges");
        for(int i=0 ; i<e ; i++){
            int s = sc.nextInt();
            int d = sc.nextInt();
            g.insertedge(s,d);
        }
    }



}

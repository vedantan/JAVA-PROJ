package com.vedant;

import java.util.Arrays;

public class AllDirectPath {
    public static void main(String[] args) {
        boolean[][] board = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        int[][] path = new int [board.length][board[0].length];
        alldirectionprint("",board,0,0 ,path ,1);
    }

    static void alldirectionprint(String p ,boolean[][] maze,int r, int c ,int[][] path ,int step) {

        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c] = step;
            for(int[] arr : path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        // i am considering this block in my path
        maze[r][c] = false;
        path[r][c] = step;

        if (r < maze.length - 1) {
            alldirectionprint(p + 'D', maze, r + 1, c, path, step + 1);
        }

        if (c < maze[0].length - 1) {
            alldirectionprint(p + 'R', maze, r, c + 1, path, step + 1);
        }

        if (r > 0) {
            alldirectionprint(p + 'U', maze, r - 1, c, path, step + 1);
        }

        if (c > 0) {
            alldirectionprint(p + 'L', maze, r, c - 1, path, step + 1);
        }
        // this is the line  where function gets over
        //so before the function gets removed also remove the changes that were made by function

        maze[r][c] = true;
        path[r][c] = step;
    }
}

package com.vedant;

public class Practise {
    public static void main(String[] args) {
        boolean[][] maze = {{true ,true ,true},
                            {true,false,true},
                            {true,true,true}
                            };

        printingall(" ",maze,0,0);
    }

    static void printingall(String a ,boolean[][] maze ,int r ,int c){
        if(r== maze.length-1 && c ==maze[0].length-1){
            System.out.println(a);
            return;
        }

        if(maze[r][c] == false){
            return;
        }

        if(r < maze.length -1){
            printingall(a+'D' , maze ,r+1,c);
        }

        if(c < maze[0].length -1){
            printingall(a+'R' , maze,r,c+1);
        }
    }

}

import java.util.ArrayList;

public class Practise {
    public static void main(String[] args) {
        boolean[][] maze = {{true,true,true},
                {true,false,true},
                {true,true,true}};

        path("",0,0,maze);
    }

    static void path(String p , int r ,int c , boolean[][] maze){
       if(r == maze.length -1 && c== maze[0].length -1){
           System.out.println(p);
          return;
       }
       if(! maze[r][c]){
           return ;
       }

//       if(r>1 && c>1){
//
//       }

       if(maze.length -1 > r){
           path(p,r+1,c,maze);

       }
       if(maze[0].length -1 > c){
           path(p,r,c+1,maze);
       }



    }

}

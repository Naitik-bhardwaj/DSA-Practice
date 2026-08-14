import java.util.*;
public class rateInMaze {
    public static ArrayList<String> ratInMaz(int[][] maze) {
        int n = maze.length;
        ArrayList<String> list = new ArrayList<>();
        if(maze[0][0] == 0){
            return list;
        }
        boolean[][] visited = new boolean[n][n];
        solve(maze, 0, 0, n-1, n-1, "", list, visited);
        return list;
    }
    public static void solve(int[][] maze, int cr, int cc, int er, int ec, String path, ArrayList<String> list, boolean visited[][] ){
        if(cr<0 || cc<0 || cr>er || cc>ec || maze[cr][cc] == 0 || visited[cr][cc]){
            return;
        }
        if(cr == er && cc==ec){
            list.add(path);
            return;
        }
        visited[cr][cc] = true;
        solve(maze, cr+1, cc, er, ec, path+"D", list, visited);
        solve(maze, cr, cc-1, er, ec, path+"L", list, visited);
        solve(maze, cr, cc+1, er, ec, path+"R", list, visited);
        solve(maze, cr-1, cc, er, ec, path+"U", list, visited);
        visited[cr][cc] = false;
    }
    public static void main(String[] args) {
        int[][] maze = {{1,0,0,0}, {1,1,0,1},{1,1,0,0},{0,1,1,1}};
        ArrayList<String> s = ratInMaz(maze);
        System.out.println(s);
    }
}
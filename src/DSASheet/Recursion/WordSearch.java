package DSASheet.Recursion;

public class WordSearch {
    public static void main(String[] args) {
        System.out.println("Word Search");
    }

    public boolean exist(char[][] board, String word) {
        int m = board.length,n = board[0].length;
        boolean[][] visited;

        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(board[i][j] == word.charAt(0)){
                    visited = new boolean[m][n];
                    boolean foundAns = dfs(i,j,0,visited,m,n,board,word);
                    if(foundAns) return true;
                }
            }
        }
        return false;
    }

    public boolean dfs(int i,int j,int currIndex,boolean[][] visited,int m,int n,char[][] board,String word){
        if(currIndex == word.length()) return true;
        if(i < 0 || i >= m || j < 0 || j >= n) return false;
        if(visited[i][j]) return false;
        if(board[i][j] != word.charAt(currIndex)) return false;

        visited[i][j] = true;
        boolean right = dfs(i+1,j,currIndex+1,visited,m,n,board,word);
        boolean bottom = dfs(i,j+1,currIndex+1,visited,m,n,board,word);
        boolean left = dfs(i-1,j,currIndex+1,visited,m,n,board,word);
        boolean up = dfs(i,j-1,currIndex+1,visited,m,n,board,word);

        boolean ans = right || bottom || left || up;

        if(!ans) visited[i][j] = false;
        return ans;
    }
}

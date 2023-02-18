package Recursion.Backtracking;

public class Maze {
    public static void main(String[] args) {
        System.out.println("Maze");
//        mazePossiblePaths("",3,3);
//        int countOfPossiblePaths = mazePossiblePathCount(3,3);
//        System.out.println(countOfPossiblePaths);

        mazePossiblePathsWithDiagonalSupport("",3,3);
    }

//    Initial co-ordinates are x,y, and we have to reach 1,1
//    Possible moves are Right or Down
    static void mazePossiblePaths(String processedPath,int x, int y){
        if(x == 1 && y == 1){
            System.out.println(processedPath);
            return;
        }
        if(x == 1){
            mazePossiblePaths(processedPath+"R",x,y-1);
        }else if(y==1){
            mazePossiblePaths(processedPath+"D",x-1,y);
        }else{
            mazePossiblePaths(processedPath+"R",x,y-1);
            mazePossiblePaths(processedPath+"D",x-1,y);
        }
    }

    static int mazePossiblePathCount(int x, int y){
        if(x == 1 || y == 1){
            return 1;
        }
        int left = mazePossiblePathCount(x,y-1);
        int right = mazePossiblePathCount(x-1,y);
        return left+right;
    }

    //    This method supports diagonal with right and down
    static void mazePossiblePathsWithDiagonalSupport(String processedPath,int x, int y){
        if(x == 1 && y == 1){
          mazePossiblePathsWithDiagonalSupport(processedPath+"R",x,y-1);
            mazePossiblePathsWithDiagonalSupport(processedPath+"D",x-1,y);
            System.out.println(processedPath);
            return;
        }

        if(x == 1){
            mazePossiblePathsWithDiagonalSupport(processedPath+"R",x,y-1);
        }else if(y==1){
            mazePossiblePathsWithDiagonalSupport(processedPath+"D",x-1,y);

        }else{
            mazePossiblePathsWithDiagonalSupport(processedPath+"d",x-1,y-1);
        }
    }

}

package Recursion.Backtracking;

public class MazeWithObstacle {
    public static void main(String[] args) {
        System.out.println("Maze with obstacle");
        possiblePathsInMaze("",1,1);
    }

//    Initial co-ordinates are x,y, and we have to reach 3,3
//    Possible moves are Right or Down, and these is a obstacle at (o1,o2) where we can not land,
//    so have to skip those paths which includes (o1,o2) in it.
    static void possiblePathsInMaze(String processedPath,int x,int y){

//        At 2,2 there is a river which we can not pass
        if(x == 2 && y == 2){
            return;
        }

        if(x == 3 && y == 3){
            System.out.println(processedPath);
            return;
        }


        if(x == 3){
            possiblePathsInMaze(processedPath+"R",x,y+1);
        }else if(y==3){
            possiblePathsInMaze(processedPath+"D",x+1,y);
        }else{
            possiblePathsInMaze(processedPath+"R",x,y+1);
            possiblePathsInMaze(processedPath+"D",x+1,y);
        }
    }
}

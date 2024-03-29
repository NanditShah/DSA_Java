package Learning.Patterns;

public class PatternsUsingRec {
    public static void main(String[] args) {
        System.out.println("Learning.Patterns using recursion");
        pattern2(4,1);
    }

    static void pattern1(int row,int col){
        if(row == 0){
            return;
        }
        if(col <= row){
            System.out.print("*");
            pattern1(row,col + 1);
        }else{
            System.out.println();
            pattern1(row- 1,1);
        }
    }

    static void pattern2(int row,int col){
        if(row == 0){
            return;
        }
        if(col <= row){
            pattern2(row,col + 1);
            System.out.print("*");
        }else{
            pattern2(row- 1,1);
            System.out.println();
        }
    }

}

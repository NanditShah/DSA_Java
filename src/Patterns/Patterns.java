package Patterns;

public class Patterns {
    public static void main(String[] args) {
//        pattern1(5);
//        pattern2(5);
//        pattern3(5);
//        pattern4(5);
//        pattern5(5);
//        pattern6(5);
//        pattern28(5);
//        pattern30(5);
//        pattern17(4);
//    pattern31(4);
//        pattern7(5);
//        pattern8(5);
//        pattern9(5);
//        pattern10(5);
//    pattern11(5);
//    pattern12(5);
//        pattern13(5);
//    pattern14(5);
    pattern15(5);
    }



//      *
//     * *
//    *   *
//   *     *
//  *       *
//   *     *
//    *   *
//     * *
//      *
static void pattern15(int n){
    System.out.println("Pattern 15");
    for(int row=0;row<2*n;row++){
        int totalSpaces = row < n ? n - row : (row - (n - 2));
        for(int space = 0 ;space < totalSpaces;space++){

            System.out.print(" ");
        }
        int totalCols = row < n ? row+1 : n - (row - (n - 1))  ;
        for(int col = 0;col<totalCols;col++){
            String whatToPrint = (col == 0) ? "*" : " ";
            System.out.print(whatToPrint);
        }
        for(int col = 0;col<totalCols - 1;col++){
            String whatToPrint = (col == totalCols - 2) ? "*" : " ";
            System.out.print(whatToPrint);
        }
        System.out.println();
    }
}


//  *********
//   *     *
//    *   *
//     * *
//      *
static void pattern14(int n){
    System.out.println("Pattern 14");
    for(int row=0;row<n;row++){
        int totalSpaces = row;
        for(int space = 0 ;space < totalSpaces;space++){
            System.out.print(" ");
        }
        int totalCols = n - row;
        for(int col = 0;col<totalCols;col++){
            String whatToPrint = (col == 0  || row == 0) ? "*" : " ";
            System.out.print(whatToPrint);
        }
        for(int col = 0;col<totalCols - 1;col++){
            String whatToPrint = (col == totalCols - 2 || row == 0) ? "*" : " ";
            System.out.print(whatToPrint);
        }
        System.out.println();
    }
}



//      *
//     * *
//    *   *
//   *     *
//  *********
    static void pattern13(int n){
        System.out.println("Pattern 13");
        for(int row=0;row<n;row++){
            int totalSpaces = n - row;
            for(int space = 0 ;space < totalSpaces;space++){
                System.out.print(" ");
            }
            int totalCols =row+1;
            for(int col = 0;col<totalCols;col++){
                String whatToPrint = (col == 0  || row == n - 1) ? "*" : " ";
                System.out.print(whatToPrint);
            }
            for(int col = 0;col<totalCols - 1;col++){
                String whatToPrint = (col == totalCols - 2 || row == n - 1) ? "*" : " ";
                System.out.print(whatToPrint);
            }
            System.out.println();
        }
    }


//   * * * * *
//    * * * *
//     * * *
//      * *
//       *
//       *
//      * *
//     * * *
//    * * * *
//   * * * * *
    static void pattern12(int n){
        System.out.println("Pattern 12");
        for(int row=0;row<2*n;row++){
                int totalSpaces = row < n ? row : 2*n - row - 1;
                for(int space = 0 ;space < totalSpaces;space++){
                    System.out.print(" ");
                }
                int totalCols = row < n ? n - row : row+1 - n;
                for(int col = 0;col<totalCols;col++){
                    System.out.print("* ");
                }
            System.out.println();
        }
    }



//   * * * * *
//    * * * *
//     * * *
//      * *
//       *
    static void pattern11(int n){
        System.out.println("Pattern 11");
        for(int row=0;row<n;row++){
            int totalSpaces = row;
            for(int space = 0 ;space < totalSpaces;space++){
                System.out.print(" ");
            }
            int totalCols = n - row;
            for(int col = 0;col<totalCols;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }



//       *
//      * *
//     * * *
//    * * * *
//   * * * * *
    static void pattern10(int n){
        System.out.println("Pattern 10");
        for(int row=0;row<n;row++){
            int totalSpaces = n - row - 1;
            for(int space = 0 ;space < totalSpaces;space++){
                System.out.print(" ");
            }
            int totalCols = row+1;
            for(int col = 0;col<totalCols;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//  *********
//   *******
//    *****
//     ***
//      *

    static void pattern9(int n){
        System.out.println("Pattern 9");
        for(int row=0;row<n;row++){
            int totalSpaces = row;
            for(int space = 0 ;space < totalSpaces;space++){
                System.out.print(" ");
            }
            int totalCols = n - row;
            for(int col = 0;col<totalCols;col++){
                System.out.print("*");
            }
            for(int col = 0;col<totalCols - 1;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


//      *
//     ***
//    *****
//   *******
//  *********
static void pattern8(int n){
    System.out.println("Pattern 8");
    for(int row=0;row<n;row++){
        int totalSpaces = n - row - 1;
        for(int space = 0 ;space < totalSpaces;space++){
            System.out.print(" ");
        }
        for(int col = 0;col<(row+1);col++){
            System.out.print("*");
        }
        for(int col = 0;col<(row);col++){
                System.out.print("*");
        }
        System.out.println();
    }
    }


//    *****
//     ****
//      ***
//       **
//        *
    static void pattern7(int n){
        System.out.println("Pattern 7");
        for(int row = n;row>0;row--){
            int totalSpace = n - row;
            for(int space = 0;space < totalSpace;space++){
                System.out.print(" ");
            }
            for(int col = 0;col<n - totalSpace;col++){
                System.out.print("*");
            }
            System.out.println();

        }
    }


//    Not completed yet
//   4 4 4 4 4 4 4
//   4 3 3 3 3 3 4
//   4 3 2 2 2 3 4
//   4 3 2 1 2 3 4
//   4 3 2 2 2 3 4
//   4 3 3 3 3 3 4
//   4 4 4 4 4 4 4
static void pattern31(int n){
    System.out.println("Pattern 31");
    int newN = 2*n;
    for(int row = 0;row<=newN;row++){
        for(int col = 0;col <= newN; col++){
            int numToPrint = col <= n ? n -  Math.min(Math.min(row,col),Math.min(newN - row,newN - col)) : col - n;
            System.out.print(numToPrint+" ");
        }
        System.out.println();
    }
}



//     1
//    212
//   32123
//  4321234
//   32123
//    212
//     1
    static void pattern17(int n){
        System.out.println("Pattern 17");
        for(int row = 1;row<=2*n;row++){
            if(row <= n){
                for(int space = 0;space < n - row;space++){
                    System.out.print(" ");
                }
                for(int col = row;col >= 1;col --){
                    System.out.print(col);

                }
                for(int col = 2;col<=row;col++){
                    System.out.print(col);
                }
            }else{
                for(int space = 0;space < row - n;space++){
                    System.out.print(" ");
                }
                int halfCols = 2*n - row;
                for(int col = halfCols;col >= 1;col --){
                    System.out.print(col);
                }
                for(int col = 2;col<=halfCols;col++){
                    System.out.print(col);
                }
            }
            System.out.println();
        }
    }


//           1
//         2 1 2
//       3 2 1 2 3
//      4 3 2 1 2 3 4
//    5 4 3 2 1 2 3 4 5
    static void pattern30(int n){
        System.out.println("Pattern 30");
        for(int row = 1;row<=n;row++){
            for(int space = 0;space < n - row;space++){
                System.out.print("  ");
            }
            for(int col = row;col >= 1;col --){
                System.out.print(col+" ");

            }
            for(int col = 2;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }


//             *
//            * *
//           * * *
//          * * * *
//         * * * * *
//          * * * *
//           * * *
//            * *
//             *
    static void pattern28(int n){
        System.out.println("Pattern 28");

        for(int row = 0;row < 2*n;row++){
            int totalColsInRow = row > n ? 2 * n - row: row;
            int totalSpaces = n - totalColsInRow;
            for(int space = 0;space < totalSpaces;space++){
                System.out.print(" ");
            }
            for(int col = 0;col < totalColsInRow ;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


//    *****
//    *****
//    *****
//    *****
//    *****
    static void pattern1(int n){
        System.out.println("Pattern 1");
        for(int row = 1;row <= n;row++){
            for(int col = 1;col <= n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//    *
//    **
//    ***
//    ****
//    *****
    static void pattern2(int n){
        System.out.println("Pattern 2");

        for(int row = 1;row <= n;row++){
            for(int col = 1;col <= row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    static void pattern3(int n){
        System.out.println("Pattern 3");

        for(int row = n;row >= 1;row--){
            for(int col = 1;col <= row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


//    1
//    1 2
//    1 2 3
//    1 2 3 4
//    1 2 3 4 5
    static void pattern4(int n){
        System.out.println("Pattern 4");

        for(int row = 1;row <= n;row++){
            for(int col = 1;col <= row;col++){
                System.out.print(col +" ");
            }
            System.out.println();
        }
    }

//    *
//    **
//    ***
//    ****
//    *****
//    ****
//    ***
//    **
//    *
    static void pattern5(int n){
        System.out.println("Pattern 5");

        for(int row = 0;row < 2*n;row++){
            int totalColsInRow = row > n ? 2 * n - row: row;
            for(int col = 0;col < totalColsInRow ;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


//          *
//         **
//        ***
//       ****
//      *****
    static void pattern6(int n){
        System.out.println("Pattern 6");

        for(int row = 0;row < n;row++){
            for(int col = 0;col < n ;col++){
                String whatToPrint = col < n - row - 1 ? " " : "*";
                System.out.print(whatToPrint);
            }
            System.out.println();
        }
    }



}
